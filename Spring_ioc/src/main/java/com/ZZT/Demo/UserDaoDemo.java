package com.ZZT.Demo;


import com.ZZT.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("application_Context.xml");
        UserDao userDao = (UserDao) app.getBean("UserDao");
        userDao.Save();
    }
}
