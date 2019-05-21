package com.jing.dao.impl;

import com.jing.dao.AccountDao;
import com.jing.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName:AccountDaoImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 19:41
 * @Version 1.0
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveAccount(Account account) {
        jdbcTemplate.update("insert into account values(null,?,?)", account.getName(), account.getMoney());
    }

    @Override
    public void delAccount(Integer id) {
        jdbcTemplate.update("delete from account where id=?", id);
    }

    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set name=?,money=? where id=?", account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public Account queryById(Integer id) {
        return jdbcTemplate.queryForObject("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), id);
    }

    @Override
    public List<Account> queryList() {
        return jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
    }
}
