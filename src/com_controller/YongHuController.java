package com_controller;

import com_entity.Yonghu;
import com_service.YongHuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/12/6
 * Time:14:34
 */
@Controller
@RequestMapping("/yonghu")
public class YongHuController {

    @Resource
    private YongHuService yongHuService;

    @RequestMapping("/login")
    public String login(Yonghu yonghu, HttpServletRequest request) {
        Yonghu resultYongHu = yongHuService.login(yonghu);
        if (resultYongHu == null) {
            return "login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("username", yonghu.getName());
            System.out.println(yonghu.getName());
            System.out.println(yonghu.getPassword());
            return "index";
        }
    }
}
