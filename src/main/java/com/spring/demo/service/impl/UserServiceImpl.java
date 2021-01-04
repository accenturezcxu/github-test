package com.spring.demo.service.impl;

import com.spring.demo.dao.IUserDao;
import com.spring.demo.entity.User;
import com.spring.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jie.a.xie on 8/31/2020.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public String getUserName(int userId) {
        User user = userDao.findById(userId).get();
        return user.getName();
    }

    @Override
    public String getUserPhone(String name) {
        User user = userDao.findUserByName(name);
        return user.getPhone();
    }

    @Override
    public int saveUser(String name) {
        User user = new User();
        user.setName(name);
        user.setPhone("123123");
        user = userDao.save(user);
        return user.getId();
    }

    @Override
    public User getUser(String phone) {
        return userDao.findUserByPhone2(phone);
    }
}
