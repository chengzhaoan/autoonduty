package com.abc.autoonduty.batch;

import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class VirusBatch {


    @Scheduled(cron="0 0 0/1 * * ? *")
    public  void getUpsState(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//        try {
//
//        } catch (IOException e) {
//            e.printStackTrace();//异常处理 发邮件
//
//        }

    }
}
