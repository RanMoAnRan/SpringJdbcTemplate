package com.jing.dao.impl;

import com.jing.dao.AccountDao;
import com.jing.pojo.Account;
import com.jing.service.accountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AccountDaoImpl2Test {

    @Autowired
    @Qualifier("accountDao2")
    private AccountDao accountDao;

    @Test
    public void saveAccount() {
    }

    @Test
    public void delAccount() {
    }

    @Test
    public void updateAccount() {
    }

    @Test
    public void queryById() {
        Account account = accountDao.queryById(1);
        System.out.println(account);
    }

    @Test
    public void queryList() {
        List<Account> accounts = accountDao.queryList();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}