package com.abc.autoonduty.batch;


import com.abc.autoonduty.crawler.UpsCrawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;

@Component
public class UpsBatch {

    @Autowired
    UpsCrawler upsCrawler;

    @Scheduled(cron="0 0 10,14,20 * * ? ")
    public  void getUpsState(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            upsCrawler.login();
        } catch (IOException e) {
            e.printStackTrace();//异常处理 发邮件

        }

    }

}
