package com.jing.shiwu.service;

import com.jing.pojo.Account;
import com.jing.shiwu.dao.SWAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName:SWAccountServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/21 16:25
 * @Version 1.0
 */
@Service
@Transactional//事务注解
public class SWAccountServiceImpl implements SWAccountService {
    @Autowired
    private SWAccountDao swAccountDao;
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        //通过账户名称查询账户
        Account sourceaccount = swAccountDao.queryAccountByName(sourceName);
        Account targetaccount = swAccountDao.queryAccountByName(targetName);

        //修改金额
        sourceaccount.setMoney(sourceaccount.getMoney()-money);
        targetaccount.setMoney(targetaccount.getMoney()+money);

        //执行修改
        swAccountDao.updateAccount(sourceaccount);


        //手动添加一个异常测试事务
        //int x=1/0;

        swAccountDao.updateAccount(targetaccount);


    }
}
