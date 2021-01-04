package com.spring.demo.exception.handler;

import com.spring.demo.response.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jie.a.xie on 8/27/2020.
 */
//@ControllerAdvice
//@RestControllerAdvice
//public class handler {
//
//    @ExceptionHandler(value = Exception.class)
//    //@ResponseBody
//    public ErrorResponse allException(Exception e){
//        return new ErrorResponse("unknown");
//    }
//}
