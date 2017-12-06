package com_dao;

import com_entity.Yonghu;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/12/6
 * Time:13:36
 */
public interface YongHuDao {

    public Yonghu login(Yonghu yongHu);

    public Yonghu select();

    public void add(Yonghu yonghu);
}
