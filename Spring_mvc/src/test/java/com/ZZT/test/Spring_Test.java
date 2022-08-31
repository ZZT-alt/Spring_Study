package com.ZZT.test;

import com.ZZT.Dao.UserDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
@SuppressWarnings({"all"})

public class Spring_Test {
    @Test
    //测试scope
    public void Test_Scope() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("application_Context.xml");
        UserDao userDao_a = (UserDao) app.getBean("userDao");
        UserDao userDao_b = (UserDao) app.getBean("userDao");
        System.out.println("a地址:" + userDao_a);
        System.out.println("b地址:" + userDao_b);
        //app.close();
    }


    /**
     * 测试手动配置
     *
     * @throws PropertyVetoException
     * @throws SQLException
     */
    @Test
    public void Test1() throws PropertyVetoException, SQLException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mysql");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String driver = resourceBundle.getString("driver");
        String password = resourceBundle.getString("password");
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driver);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * 测试Spring容器产生数据源对象
     */
    @Test
    public void Test2() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("application_Context.xml");
        DataSource dataSource = (DataSource) app.getBean("dataSource");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
