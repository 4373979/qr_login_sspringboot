package com.example.demo.service;

import com.example.demo.entity.Login;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    /*
     * 根据userName查找用户信息
     * */
    Login getLogin(String username);

    /*
     * 根据userName查找用户信息
     * */
    Login toLogin(String username,String password);
}
