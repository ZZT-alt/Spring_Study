package com.ZZT.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext app = new ClassPathXmlApplicationContext("application_Context.xml");
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("app", app);
        System.out.println("Spring容器创建完毕...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
