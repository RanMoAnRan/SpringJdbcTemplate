package com.jing.service;

import com.jing.pojo.Account;

import java.util.List;

/**
 * @ClassName:accountService
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 19:52
 * @Version 1.0
 */
public interface accountService {
    void saveAccount(Account account);

    void delAccount(Integer id);

    void updateAccount(Account account);

    Account queryById(Integer id);

    List<Account> queryList();
}
