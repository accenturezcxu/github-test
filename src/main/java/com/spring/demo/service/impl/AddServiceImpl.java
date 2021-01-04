package com.spring.demo.service.impl;

import com.spring.demo.service.IAddService;
import org.springframework.stereotype.Service;

/**
 * Created by jie.a.xie on 8/26/2020.
 */
@Service
public class AddServiceImpl implements IAddService {

    @Override
    public int add(int data1, int data2) {
        return data1+data2;
    }

}
