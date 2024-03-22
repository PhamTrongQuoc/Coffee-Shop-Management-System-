package com.DoAn.ChatCoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String index(){
        return "user/index";
    }
    @GetMapping("/login")
    public String formLogin(){
        return "user/login";
    }
    @GetMapping("/register")
    public String formregister(){
        return "user/register";
    }
}

