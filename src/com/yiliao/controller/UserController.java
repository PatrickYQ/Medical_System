package com.yiliao.controller;

import com.yiliao.entity.User;
import com.yiliao.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/12/7
 * Time:13:29
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user) {
        User userresult = userService.login(user);
        System.out.println("----------");
        if (userresult != null) {
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            return "index";
        } else {
            return "login";
        }
    }
}
