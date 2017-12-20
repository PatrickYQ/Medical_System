package com.yiliao.controller;

import com.yiliao.entity.User;
import com.yiliao.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String login(User user, Model model) {
        User userresult = userService.login(user);
        if (userresult != null) {
            //获取用户权限
            int access = userService.selectAccess(user);
            System.out.println(user.getAccess());
            model.addAttribute("access", access);
            return "index";
        } else {
            return "login";
        }
    }

    @RequestMapping("add")
    public String add(User user) {
        return "tjuserform";
    }

    @RequestMapping("adduser")
    public String addUser(User user) {
        System.out.println(user.toString());
        userService.add(user);
        return "login";
    }

}
