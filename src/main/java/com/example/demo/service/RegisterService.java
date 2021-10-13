package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface RegisterService {

    Integer toRegister(String username, String password);
}
