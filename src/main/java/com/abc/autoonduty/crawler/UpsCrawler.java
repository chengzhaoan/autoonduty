package com.abc.autoonduty.crawler;

import com.abc.autoonduty.crawler.entity.upsAllstate;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;

@Component
public class UpsCrawler {

    private final static Logger logger = LoggerFactory.getLogger(UpsCrawler.class);


    @Value("${com.abc.autoduty.ups.loginname}")
    String loginName;
    @Value("${com.abc.autoduty.ups.password}")
    String password;


    String loginUrl ="http://10.63.65.236/numweb/handler/login.ashx";

    String afterloginUrl = "http://10.63.65.236/numweb/upsmon.aspx";

    String upsStateUrl = "http://10.63.65.236/numweb/handler/ups.ashx";

    public  boolean login() throws IOException {
        HashMap<String,String> loginpostpara= new HashMap<>();
        loginpostpara.put("uname",loginName );
        loginpostpara.put("password", password);
        logger.info(loginName,password);
        System.out.println(loginName+password);
        String result = HttpClientTool.doPost(loginUrl,loginpostpara);
        logger.info(result);
        if(result.equals("success")){
//          result =  HttpClientTool.doGet(afterloginUrl,null);

            HashMap<String,String> getState= new HashMap<>();
            loginpostpara.put("branchid","all" );
            loginpostpara.put("xaction", "readMonGrid");
            result =  HttpClientTool.doGet(afterloginUrl,null);
            logger.info(result);
            result = HttpClientTool.doPost(upsStateUrl,getState);
            logger.info(result);
            upsAllstate upsState =JSON.parseObject(result,upsAllstate.class);
            logger.info(upsState.toString());

        }
        logger.info(result);


        return false;
    }






}




