package com.jing.springlistenner.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName:SpringDaoimp
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/21 17:55
 * @Version 1.0
 */
@Repository("springdao")
public class SpringDaoImpl implements SpringDao {
    @Override
    public void test() {
        System.out.println("spring监听器测试");
    }
}
