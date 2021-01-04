package com.spring.demo.dao;

import com.spring.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jie.a.xie on 8/31/2020.
 */
public interface IUserDao extends JpaRepository<User,Integer> {

    User findUserByName(String userName);

    @Query("select u from User u where u.phone = :phone")
    User findUserByPhone(@Param("phone") String phone);


    @Query(value = "select * from user where phone = :phone", nativeQuery = true)
    User findUserByPhone2(@Param("phone") String phone);


}
