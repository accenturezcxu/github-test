package com.spring.demo.controller;

import com.spring.demo.service.ICacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jie.a.xie on 9/1/2020.
 */
@RestController
@RequestMapping("/cache")
public class CacheController {
    @Autowired
    public ICacheService cacheService;

    @GetMapping("/test1")
    public ResponseEntity test1(){
        return ResponseEntity.ok(cacheService.testCache("123"));
    }

    @GetMapping("/test2")
    public ResponseEntity test2(){
        cacheService.deleteCache("123");
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/test3")
    public ResponseEntity test3(){
        return ResponseEntity.ok(cacheService.putCache("123"));
    }
}
