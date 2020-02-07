package com.william.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.william.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserActionController {
    //自动注入
    @Autowired
    private UserService userService;

    @RequestMapping("show_user")
    public String showUser(HttpServletRequest req) {
        //获取所有用户信息，这里偷懒，下一行只取一个
        List<Map<String, Object>> list = userService.listUsers();
        //获取第一个用户信息
        Map<String, Object> map = list.get(0);
        req.setAttribute("user_name", map.get("user_name"));
        req.setAttribute("password", map.get("password"));
        return "main";
    }
}