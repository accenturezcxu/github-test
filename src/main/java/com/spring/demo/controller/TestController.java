package com.spring.demo.controller;

import com.spring.demo.entity.User;
import com.spring.demo.response.TestResponse;
import com.spring.demo.service.IAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * Created by jie.a.xie on 8/26/2020.
 */
@RestController
@RequestMapping("/rest")
public class TestController {

    @Value("${a.b}")
    private String test;

    @Autowired
    @Qualifier(value = "staticAddServiceImpl")
    private IAddService addService;


    @Autowired
    private RedisTemplate<Serializable, Object> redisTemplate;


    @GetMapping("/1")
    public String rest1(){
        System.out.println("function1");
        return test;
    }

    @RequestMapping("/2")
    public TestResponse rest2(){
        TestResponse testResponse = new TestResponse();
        testResponse.setValue1("1");
        testResponse.setValue2("2");
        return testResponse;
    }

    @RequestMapping("/3")
    public ResponseEntity<TestResponse> rest3(){
        TestResponse testResponse = new TestResponse();
        testResponse.setValue1("1");
        testResponse.setValue2("2");

        return ResponseEntity.ok(testResponse);
    }

    @PostMapping("/4")
    public ResponseEntity rest4(@RequestBody TestResponse testResponse){
        System.out.println(testResponse.getValue1());
        return ResponseEntity.ok(testResponse);
    }

    @GetMapping("/5/{value}")
    public String rest5(@PathVariable("value") String value){
        return value;
    }

    @GetMapping("/6")
    public String rest6(){

        return addService.add(1,1)+"";

    }

    @RequestMapping("/set")
    public String setPOJO(){

        User user = new User();
        user.setId(1);
        user.setName("卢本伟");
        user.setPhone("123456");

        redisTemplate.opsForValue().set("user1", user);
        return "存储对象";
    }

    @RequestMapping("/get")
    public Object getPOJO(){

        return redisTemplate.opsForValue().get("user1");
    }


}
