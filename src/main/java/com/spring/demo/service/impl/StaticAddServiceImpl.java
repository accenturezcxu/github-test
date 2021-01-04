package com.spring.demo.service.impl;

import com.spring.demo.service.IAddService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by jie.a.xie on 8/26/2020.
 */
@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StaticAddServiceImpl implements IAddService {

    public static int sValue = 123;

    @Override
    public int add(int data1, int data2) {

        sValue = data1;

        return data1+data2+sValue;
    }
}
