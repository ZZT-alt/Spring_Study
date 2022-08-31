package com.ZZT.factory;

import com.ZZT.Dao.Impl.UserDaoImpl;
import com.ZZT.Dao.UserDao;

@SuppressWarnings({"all"})
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
