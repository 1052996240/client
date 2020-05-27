package com.example.demo.controller;


import com.example.demo.util.QRcodeUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


/**
 * Created by daijie on 2019/9/5
 */
@RestController
@RequestMapping("/code")
public class BarCodeController {



    /**
     * 生成二维码
     * @param content
     * @param response
     */
    @RequestMapping("/getQRcode/{content}")
    public void getQRcode(@PathVariable String content,HttpServletResponse response) {
        // 二维码的内容
//        String content = "二维码存储信息";
        //参数为二维码的内容、长、宽、响应对象
        QRcodeUtil.creatRrCode(content,200,200,response);

    }
}
