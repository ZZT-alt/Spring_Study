package com.ZZT.controller;

import com.ZZT.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BrandController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("application_Context.xml");
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transfer("华为","小米",10);
    }
}
