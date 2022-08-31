package com.ZZT.test;

import com.ZZT.Domain.Brand;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class JDBC_Template_test {
    @Test
    //测试JDBC_Template
    public void Test() throws SQLException {
        //创建数据源对象
        ApplicationContext app = new ClassPathXmlApplicationContext("application_Context.xml");
        DataSource dataSource = (DataSource) app.getBean("dataSource");
//        Connection connection=dataSource.getConnection();
//        System.out.println(connection);
//        connection.close();
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源对象
        jdbcTemplate.setDataSource(dataSource);
        jdbcTemplate.update("insert into news values(?,?)", 6, "哈哈嗨");
    }

    @Test
    public void Test_use_xml() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application_Context.xml");
        JdbcTemplate appBean = app.getBean(JdbcTemplate.class);

        List list = appBean.queryForList("select * from tb_brand");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void Test_Query() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application_Context.xml");
        JdbcTemplate appBean = app.getBean(JdbcTemplate.class);
        List<Brand> brandList = appBean.query("select * from tb_brand", new BeanPropertyRowMapper<Brand>(Brand.class));
        System.out.println(brandList);
        for(Brand i: brandList){
            System.out.println(i);
        }

    }
}
