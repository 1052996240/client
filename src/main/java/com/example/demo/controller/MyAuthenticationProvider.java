package com.example.demo.controller;

/**
 * Created by admin on 2020/5/6.
 */

import com.example.demo.service.UserDetailServiceImpl;
import com.example.demo.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 完成校验工作
 */
@Component
public class MyAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private UserDetailServiceImpl userDetailService;

    /**
     * 进行身份认证
     *
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 获取用户输入的用户名和密码
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        // 获取封装用户信息的对象
        UserDetails userDetails = userDetailService.loadUserByUsername(username);
        if (!userDetails.getPassword().equals(password)) {
            if (SessionUtil.getSessionAttribute("msg") != null) {
                SessionUtil.removeSessionAttribute("msg");
            }
            SessionUtil.setSessionAttribute("msg", "密码错误");
            SessionUtil.removeSessionAttribute("U001");//账号
            SessionUtil.removeSessionAttribute("U002");//密码
            SessionUtil.removeSessionAttribute("U004");//公司id
            SessionUtil.removeSessionAttribute("U006");//权限
//            System.out.println("密码错误");
            throw new BadCredentialsException("密码错误");
        }
//        System.out.println("session里的U001："+SessionUtil.getSessionAttribute("U001"));
//        System.out.println("session里的ID："+SessionUtil.getSessionId());

        boolean flag2 = false;
        if (password.equals(userDetails.getPassword())) {
            flag2 = true;
        }
        // 校验通过
        if (flag2) {
            // 将权限信息也封装进去
            UsernamePasswordAuthenticationToken qq = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
            return qq;
        }
        // 验证失败返回 null
        return null;
    }

    /**
     * 这个方法 确保返回 true 即可，
     *
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}

