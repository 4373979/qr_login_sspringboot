package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController{

    @Autowired
    private LoginService loginService;

    @GetMapping("/select")
    public Login getLogin(@Param("userName") String userName ){

        return loginService.getLogin(userName);

    }

    @PostMapping("/login")
    public Login toLogin(@RequestBody Login login){
//        System.out.println(login.getUserName()+":"+login.getUserPass());
        return loginService.toLogin(login.getUserName(), login.getUserPass());
    }
}