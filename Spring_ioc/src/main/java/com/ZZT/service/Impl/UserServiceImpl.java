package com.ZZT.service.Impl;

import com.ZZT.Dao.UserDao;
import com.ZZT.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@SuppressWarnings({"all"})
@Component("userService")
public class UserServiceImpl implements UserService {
    private UserDao userDao;

//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public UserServiceImpl() {

    }
//    @Autowired
//    @Qualifier("userDao")

    /**
     * @Resource相当于@Autowired与@Qualifier结合
     * @param userDao
     */
    @Resource(name = "userDao")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.Save();
    }
}
