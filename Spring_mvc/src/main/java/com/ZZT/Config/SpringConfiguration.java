package com.ZZT.Config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@SuppressWarnings({"all"})

/**
 * 标志这是一个Spring的核心配置类
 */
@Configuration

/**
 * <context:component-scan base-package="com.ZZT"/>
 */
@ComponentScan("com.ZZT")
@PropertySource("classpath:mysql.properties")
public class SpringConfiguration {
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String user;
    @Value("${driver}")
    private String driver;
    @Value("${password}")
    private String password;

    @Bean("dataSource")
    public DataSource Get_Datasource() throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driver);
        return  dataSource;
    }

}
