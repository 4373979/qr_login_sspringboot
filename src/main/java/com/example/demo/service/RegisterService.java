package com.example.demo.service;

import com.example.demo.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface RegisterService {

    Integer toRegister(@Param("login") Login login);
}
