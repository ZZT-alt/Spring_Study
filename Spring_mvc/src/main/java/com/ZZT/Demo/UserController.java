package com.ZZT.Demo;

import com.ZZT.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app =new ClassPathXmlApplicationContext("application_Context.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
