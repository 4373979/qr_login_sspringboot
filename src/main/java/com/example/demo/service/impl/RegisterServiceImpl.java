package com.example.demo.service.impl;

import com.example.demo.entity.Login;
import com.example.demo.mapper.RegisterMapper;
import com.example.demo.service.RegisterService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private RegisterMapper registerMapper;

    @Override
    public Integer toRegister(@Param("login") Login login) {
        return registerMapper.toRegister(login);
    }
}
