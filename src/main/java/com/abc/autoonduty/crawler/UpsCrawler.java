package com.abc.autoonduty.crawler;

import org.springframework.beans.factory.annotation.Value;

public class UpsCrawler {

    @Value("com.abc.autoduty.ups.ipAddr")
    String IpAddr;
    @Value("com.abc.autoduty.ups.loginname")
    String loginName;
    @Value("com.abc.autoduty.ups.password")
    String password;


    String loginUrl ="";

    public boolean login(){
        return false;
    }





}




