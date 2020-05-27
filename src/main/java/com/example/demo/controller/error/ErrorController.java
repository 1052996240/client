package com.example.demo.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2020/5/18.
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping("/overLimitIP")
    public Object overLimitIP() {
        return "error/overLimitIP";
    }
}
