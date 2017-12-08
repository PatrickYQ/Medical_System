package com.yiliao.service.impl;

import com.yiliao.dao.UserDao;
import com.yiliao.entity.User;
import com.yiliao.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/12/7
 * Time:13:26
 */
@Service("yongHuService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
