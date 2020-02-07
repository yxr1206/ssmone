package com.william.service.impl;

import com.william.mapper.UserMapper;
import com.william.service.UserService;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<Map<String, Object>> listUsers() {
        List<Map<String, Object>> users =  userMapper.listUsers();
        for (Map<String, Object> user : users) {
            String password = user.get("password").toString();
            //给密码“加密”，返回给页面
            if(password.length() > 6) {
                //密码大于6位，除去首尾字符外，全部替换成*
                String star = "";
                for (int i = 0; i < password.length() - 2; i++) {
                    star += "*";
                }
                password = password.charAt(0) + star + password.charAt(password.length() - 1);
            } else {
                //密码小于6位，全部替换成*
                password = password.replaceAll(".", "*");
            }
            user.put("password", password);
        }
        return users;
    }

}
