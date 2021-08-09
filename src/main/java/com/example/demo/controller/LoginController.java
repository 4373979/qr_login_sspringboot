package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController{

    @Resource
    private HttpSession session;

    String SESSION_KEY =  "username";

    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String indexPage(){
        return "view/index";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

//    @GetMapping("/select")
//    public Login getLogin(@Param("userName") String userName ){
//
//        return loginService.getLogin(userName);
//
//    }

    @GetMapping("/loginError")
    public String loginError(){
        return "loginError";
    }

    @PostMapping("/webLoginVerify")
    public String webLogin(@RequestParam("userName") String userName, @RequestParam("userPass") String userPass, Model model){
        Login userLogin = loginService.toLogin(userName, userPass);
        if (userLogin!=null){
            session.setAttribute(SESSION_KEY,userName);
            model.addAttribute(SESSION_KEY,userName);
            return "view/index";
        }else{
            return "redirect:/loginError";
        }
    }

    @PostMapping("/phoneLoginVerify")
    public Login phoneLogin(@RequestBody Login login){
        Login userLogin = loginService.toLogin(login.getUserName(), login.getUserPass());
        return userLogin;
    }


//    @PostMapping("/loginVerify")
//    public Login toLogin(@RequestBody Login login){
//        System.out.println(login.getUserName()+":"+login.getUserPass());
//        return loginService.toLogin(login.getUserName(), login.getUserPass());
//    }


}

