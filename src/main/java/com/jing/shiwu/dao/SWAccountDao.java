package com.jing.shiwu.dao;

import com.jing.pojo.Account;

/**
 * @ClassName:SWAccountDao
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 20:53
 * @Version 1.0
 */
public interface SWAccountDao {
    Account queryAccountByName(String name);

    void updateAccount(Account account);
}
