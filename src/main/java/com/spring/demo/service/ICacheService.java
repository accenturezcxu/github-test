package com.spring.demo.service;

/**
 * Created by jie.a.xie on 9/1/2020.
 */
public interface ICacheService {
    String testCache(String key);

    void deleteCache(String key);

    String putCache(String key);
}
