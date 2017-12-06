package com_service;

import com_entity.Yonghu;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/12/6
 * Time:13:42
 */
public interface YongHuService {

    public Yonghu login(Yonghu yongHu);

    public Yonghu select();

    public void add(Yonghu yonghu);

}
