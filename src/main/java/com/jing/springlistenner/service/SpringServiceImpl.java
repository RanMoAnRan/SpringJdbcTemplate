package com.jing.springlistenner.service;

import com.jing.springlistenner.dao.SpringDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName:SpringServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/21 17:59
 * @Version 1.0
 */
@Service("springService")
public class SpringServiceImpl implements SpringService {
    @Autowired
    private SpringDao springDao;
    @Override
    public void test() {
        springDao.test();
    }
}
