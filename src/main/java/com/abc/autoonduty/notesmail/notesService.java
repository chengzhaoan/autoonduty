package com.abc.autoonduty.notesmail;


import lotus.notes.*;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;


public class notesService implements Runnable{

    Database dominoDb	=	null;

    Document mailDoc	=	null;

    Session session = null;

    @Value("{com.abc.autoduty.mail.dominoServerName}")
    String dominoServerName ;
    @Value("{com.abc.autoduty.mail.mailFileDb}")
    String mailFileDb ;
    @Value("{com.abc.autoduty.mail.password}")
    String password ;
    @Value("{com.abc.autoduty.mail.notesUserName}")
    String notesUserName;



    ArrayBlockingQueue<MailBody>  mailQueue =new ArrayBlockingQueue<MailBody>(100);

    @PostConstruct
    public void init() throws NotesException {
        Session s = Session.newInstance();
        Registration reg;
        reg = s.createRegistration();
        reg.switchToID ( notesUserName,password);
        dominoDb = s.getDatabase(dominoServerName, mailFileDb);
    }



    public boolean AddQueue(MailBody mailBody){
        return mailQueue.offer(mailBody);
    }

    @PreDestroy
    public void destory() throws NotesException {
        if(session!=null){
            if(dominoDb!=null){
                dominoDb.recycle();
            }
        }
    }


    public boolean send(MailBody mailBody ){
    try {
        mailDoc = dominoDb.createDocument();

        //mailmessage.replaceItemValue("Form", "Memo");

        mailDoc.replaceItemValue("Form", mailBody.getForm());

        mailDoc.replaceItemValue("Subject", mailBody.getSubject());


        RichTextItem rtitem = mailDoc.createRichTextItem("body");

        rtitem.appendText(mailBody.getBody());
        // rtitem.embedObject(EmbeddedObject.EMBED_ATTACHMENT, null, "d:\\windows7-x86.cab", "notes.txt");
        mailDoc.setEncryptOnSend(true);
        mailDoc.setSaveMessageOnSend(true);
        mailDoc.setSignOnSend(true);

        mailDoc.sign();
        mailDoc.setSaveMessageOnSend(true);

        String sendlist[] = mailBody.getSendto().split(";");

        java.util.Vector<String> to = new Vector<String>();
        for (String sendto : sendlist) {
            to.add(sendto);
        }
        //v.addAll(sendlist);
        // v.addElement("���װ�/���л���/����/�ӱ�/ABC"); // �ռ���
        //v.addElement("chengzhaoan@163.com");
         /*  v.addElement("HDADM/����/�ӱ�/ABC");
        v.addElement("����/���л���/����/�ӱ�/ABC");
        */
        // mailmessage.replaceItemValue("SendTo", "chengzhaoan@163.com");//��������Ѿ���������ʾ���͸�˭����Ŀ
        mailDoc.replaceItemValue("SendTo", to);//��������Ѿ���������ʾ���͸�˭����Ŀ
        mailDoc.save();
        mailDoc.send(to);
    }catch(NotesException e){
         //添加到数据库记录
        //日志
        e.printStackTrace();
        return false;
    }

    return  true;
    }


    @Override
    public void run() {
        while(true){
            try {
                MailBody mail = mailQueue.take();
                send(mail);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean checkUnreadMail(){
        return false;
    }



}
