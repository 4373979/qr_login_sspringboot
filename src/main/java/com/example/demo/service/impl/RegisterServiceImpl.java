package com.example.demo.service.impl;

import com.example.demo.mapper.RegisterMapper;
import com.example.demo.service.RegisterService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private RegisterMapper registerMapper;

    @Override
    public Integer toRegister(String username, String password) {
        return registerMapper.toRegister(username,password);
    }
}
