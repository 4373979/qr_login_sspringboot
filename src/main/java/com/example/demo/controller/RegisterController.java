package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.RegisterService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @PostMapping("/Register")
    @ResponseBody
    public Integer toRegister(@RequestBody Login login){
        System.out.println("Register:    "+login.toString());
        return registerService.toRegister(login.getUsername(),login.getPassword());

    }


}

