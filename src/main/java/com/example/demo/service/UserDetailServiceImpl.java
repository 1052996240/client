package com.example.demo.service;

import com.example.demo.dao.mapperdao1.EuserMapper;
import com.example.demo.entity.Euser;
import com.example.demo.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户拦截权限管理
 * Created by admin on 2020/5/6.
 */
@Component
public class UserDetailServiceImpl {

    // demo  不想写 service层，直接 dao 层穿透到 controller 层
    @Autowired
    private EuserMapper euserMapper;

    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        // 根据用户名查询数据库，查到对应的用户
        Euser euser = euserMapper.selectByPrimaryKey(name);
        // ... 做一些异常处理，没有找到用户之类的
        if (euser == null) {
            System.out.println("用户不存在");
            if (SessionUtil.getSessionAttribute("msg") != null) {
                SessionUtil.removeSessionAttribute("msg");
            }
            SessionUtil.setSessionAttribute("msg", "用户不存在");
            throw new UsernameNotFoundException("用户不存在");
        } else {
            SessionUtil.setSessionAttribute("U001",euser.getU001());//账号
            SessionUtil.setSessionAttribute("U002",euser.getU002());//密码
            SessionUtil.setSessionAttribute("U004",euser.getU004());//公司id
            SessionUtil.setSessionAttribute("U006",euser.getU006());//权限
        }
        // 添加角色
        List<GrantedAuthority> authorities = new ArrayList<>();

        authorities.add(new SimpleGrantedAuthority(euser.getU006()));

        // 构建 Security 的 User 对象
        User user = new User(euser.getU001(),euser.getU002(), authorities);
        return user;
    }
}
