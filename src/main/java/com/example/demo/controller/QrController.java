package com.example.demo.controller;

import com.example.demo.utils.QrCodeUtils;
import com.power.common.util.UUIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@Controller
@RequestMapping("/QrCode")
public class QrController {

    @RequestMapping("/createQrCode")
    public void createQrCode(HttpServletRequest request, HttpServletResponse response) {
        StringBuffer url = request.getRequestURL();
        try {
            OutputStream os = response.getOutputStream();
//            QrCodeUtils.encode("http://www.baidu.com", "/static/img/1.png", os, true);
            QrCodeUtils.encode(UUIDUtil.getUuid32(), "/static/img/1.png", os, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
