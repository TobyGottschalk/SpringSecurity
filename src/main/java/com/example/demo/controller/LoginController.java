package com.example.demo.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){

        return "login";
    }

    @PostMapping("login")
    public String postLogin(){

        return "index";
    }
}
