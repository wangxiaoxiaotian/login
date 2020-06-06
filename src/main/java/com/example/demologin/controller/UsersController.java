package com.example.demologin.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UsersController {

    @RequestMapping("hello")
    public String demo(){
        return "hello world";
    }
}
