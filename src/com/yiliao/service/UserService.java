package com.yiliao.service;

import com.yiliao.entity.User;

import java.util.List;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/12/7
 * Time:13:25
 */
public interface UserService {
    /**
     * 登录方法
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 添加用户
     * @param user
     */
    public void add(User user);

    /**
     * 查询用户权限
     * @return
     */
    public int selectAccess();
}
