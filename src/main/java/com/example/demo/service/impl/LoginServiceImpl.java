package com.example.demo.service.impl;

import com.example.demo.entity.Login;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;


    @Override
    public Login getLogin(String username){
        return loginMapper.getLogin(username);
    }

    //登录
    @Override
    public Login toLogin(String username, String password) {
        return loginMapper.toLogin(username, password);
    }
}
