package com.example.demo.service;

import com.example.demo.dao.mapperdao1.EuserMapper;
import com.example.demo.entity.Euser;
import com.example.demo.entity.EuserExample;
import com.example.demo.util.Message;
import com.example.demo.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 权限管理
 * Created by admin on 2020/5/12.
 */
@Service
public class RightControlServiceImpl {
    @Autowired
    EuserMapper userMapper;

    /**
     * 添加新用户
     * @param user
     * @return
     */
    public Object addUser(Euser user) {
        if (user == null) {
            return new Message("0");
        } else {
            String u006 = (String) SessionUtil.getSessionAttribute("U006");//该用户的权限
            String u004 = (String) SessionUtil.getSessionAttribute("U004");//该用户所在的公司id
            user.setU004(u004);
            if (u006.equals("ROLE_ONE")) {
                user.setU006("ROLE_TWO");
            } else if (u006.equals("ROLE_TWO")) {
                user.setU006("ROLE_THREE");
            }
            userMapper.insertSelective(user);
            return new Message("1");
        }
    }

    /**
     * 返回message=1即没有权限
     * 查看此账户能管理的用户
     * @return
     */
    public Object selUser() {
        String u006 = (String) SessionUtil.getSessionAttribute("U006");//该用户的权限
        String u004 = (String) SessionUtil.getSessionAttribute("U004");//该用户所在的公司id
        EuserExample euserExample = new EuserExample();
        EuserExample.Criteria criteria = euserExample.createCriteria();
        if (u006.equals("ROLE_TWO")) {
            criteria.andU004EqualTo(u004);
            return userMapper.selectByExample(euserExample);
        } else if (u006.equals("ROLE_ONE")) {
            euserExample.setOrderByClause("U004 ASC");
            criteria.andU001IsNotNull();
            return userMapper.selectByExample(euserExample);
        }
        return new Message("1");
    }
}
