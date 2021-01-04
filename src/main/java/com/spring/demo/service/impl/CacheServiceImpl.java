package com.spring.demo.service.impl;

import com.spring.demo.service.ICacheService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by jie.a.xie on 9/1/2020.
 */
@Service
public class CacheServiceImpl implements ICacheService {

    @Cacheable(value = "test")
    @Override
    public String testCache(String key) {
        System.out.println("!!!!!!!!!");
        return key+System.currentTimeMillis();
    }

    @CacheEvict(value = "test")
    @Override
    public void deleteCache(String key) {

    }

    @CachePut(value = "test")
    @Override
    public String putCache(String key) {
        return key+System.currentTimeMillis();
    }


}
