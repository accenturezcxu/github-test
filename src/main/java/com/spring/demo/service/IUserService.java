package com.spring.demo.service;

import com.spring.demo.entity.User;

/**
 * Created by jie.a.xie on 8/31/2020.
 */
public interface IUserService {
    String getUserName(int userId);

    String getUserPhone(String name);

    int saveUser(String name);

    User getUser(String phone);

}
