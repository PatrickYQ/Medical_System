package com_services_impl;

import com_dao.YongHuDao;
import com_entity.Yonghu;
import com_service.YongHuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author:DuzhenTong
 * Date:2017/12/6
 * Time:13:53
 */
@Service("YongHuService")
public class YongHuServiceImpl implements YongHuService {
    @Resource
    private YongHuDao yongHuDao;

    @Override
    public Yonghu login(Yonghu yongHu) {
        return yongHuDao.login(yongHu);
    }

    @Override
    public Yonghu select() {
        return yongHuDao.select();
    }

    @Override
    public void add(Yonghu yonghu) {
        yongHuDao.add(yonghu);
    }
}
