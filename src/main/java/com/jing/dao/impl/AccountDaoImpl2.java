package com.jing.dao.impl;

import com.jing.dao.AccountDao;
import com.jing.pojo.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @ClassName:AccountDaoImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 19:41
 * @Version 1.0
 */
public class AccountDaoImpl2 extends JdbcDaoSupport implements AccountDao {

    @Override
    public void saveAccount(Account account) {
        getJdbcTemplate().update("insert into account values(null,?,?)", account.getName(), account.getMoney());
    }

    @Override
    public void delAccount(Integer id) {
        getJdbcTemplate().update("delete from account where id=?", id);
    }

    @Override
    public void updateAccount(Account account) {
        getJdbcTemplate().update("update account set name=?,money=? where id=?", account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public Account queryById(Integer id) {
        return getJdbcTemplate().queryForObject("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), id);
    }

    @Override
    public List<Account> queryList() {
        return getJdbcTemplate().query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
    }
}
