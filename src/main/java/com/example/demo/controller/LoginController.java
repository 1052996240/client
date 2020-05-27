package com.example.demo.controller;

import com.example.demo.util.SessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by admin on 2020/5/5.
 */
//@RequestMapping("/login11")
//@RestController
@Controller
@Slf4j
public class LoginController {

    private final String PREFIX = "pages/";
    /**
     * 欢迎页
     * @return
     */
    @GetMapping("/welcome")
    public String index() {
        return "welcome";
    }

    /**
     * level1页面映射
     * @param path
     * @return
     */
    @GetMapping("/level1/{path}")
    public String level1(@PathVariable("path")String path) {
        return PREFIX+"level1/"+path;
    }

    /**
     * level2页面映射
     * @param path
     * @return
     */
    @GetMapping("/level2/{path}")
    public String level2(@PathVariable("path")String path) {
        return PREFIX+"level2/"+path;
    }

    /**
     * level3页面映射
     * @param path
     * @return
     */

    @PreAuthorize("hasRole('ROLE_ONE')")
    @GetMapping("/level3/{path}")
    public String level3(@PathVariable("path")String path) {
        return PREFIX+"level3/"+path;
    }


    @GetMapping("/login")
    public String getlogin() {
        log.info("登录页面...");
//        System.out.println(SessionUtil.getSessionId()+"-->访问");
        return "login";
    }


}
