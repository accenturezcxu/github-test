package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by jie.a.xie on 8/26/2020.
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/1")
    public String mapping1(){
        return "page1";
    }

    @RequestMapping("/2")
    @ResponseBody
    public String mapping2(){
        return "mapping2";
    }

    @RequestMapping("/3")
    public String mapping3(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("name","3");
        return "page1";
    }

}
