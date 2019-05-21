package com.jing.service.impl;

import com.jing.dao.AccountDao;
import com.jing.pojo.Account;
import com.jing.service.accountService;

import java.util.List;

/**
 * @ClassName:accountServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 19:53
 * @Version 1.0
 */
public class accountServiceImpl implements accountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void delAccount(Integer id) {
        accountDao.delAccount(id);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public Account queryById(Integer id) {
        return accountDao.queryById(id);
    }

    @Override
    public List<Account> queryList() {
        return accountDao.queryList();
    }
}
