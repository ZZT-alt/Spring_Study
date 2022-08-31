package com.ZZT.Dao.Impl;

import com.ZZT.Dao.UserDao;
import com.ZZT.Domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Component("userDao")
@Scope("prototype")
public class UserDaoImpl implements UserDao {

    private List<String>stringList;
    private Map<String, User>UseMap;
    private Properties properties;
    private int age;
    private String name;

    @Value("${url}")
    private String url;
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUseMap(Map<String, User> useMap) {
        UseMap = useMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建...");
    }


    @Override
    public void Save() {
        System.out.println("名字:"+name);
        System.out.println("年龄:"+age);
        System.out.println("------------------");
        System.out.println(stringList);
        System.out.println(UseMap);
        System.out.println(properties);
        System.out.println(url);
        System.out.println("Save...");
    }

    @Override
    @PostConstruct
    public void Init() {
        System.out.println("Init...");
    }

    @Override
    @PreDestroy
    public void Delete() {
        System.out.println("Delete...");
    }

}
