package com.jing.dao;

import com.jing.pojo.Account;

import java.util.List;

/**
 * @ClassName:AccountDao
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 19:37
 * @Version 1.0
 */
public interface AccountDao {
    /**
     * @Description //TODO 增
     * @Date 19:40 2019/5/19
     * @param account
     * @return void
     **/
    void saveAccount(Account account);
    /**
     * @Description //TODO 删除
     * @Date 19:40 2019/5/19
     * @param id
     * @return void
     **/
    void delAccount(Integer id);
    /**
     * @Description //TODO 修改
     * @Date 19:40 2019/5/19
     * @param account
     * @return void
     **/
    void updateAccount(Account account);
    /**
     * @Description //TODO 根据id查询
     * @Date 19:40 2019/5/19
     * @param id
     * @return com.jing.pojo.Account
     **/
    Account queryById(Integer id);
    /**
     * @Description //TODO 查询所有数据
     * @Date 19:41 2019/5/19
     * @param
     * @return java.util.List<com.jing.pojo.Account>
     **/
    List<Account> queryList();
}
