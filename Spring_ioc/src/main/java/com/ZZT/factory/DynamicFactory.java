package com.ZZT.factory;

import com.ZZT.Dao.Impl.UserDaoImpl;
import com.ZZT.Dao.UserDao;

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
