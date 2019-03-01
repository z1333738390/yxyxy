package com.yxyxy.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("home")
public class HomePageController {

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("name","张三");
        return "index";
    }
}
