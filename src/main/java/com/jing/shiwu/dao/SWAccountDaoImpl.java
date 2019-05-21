package com.jing.shiwu.dao;

import com.jing.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName:SWAccountDaoImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/19 20:55
 * @Version 1.0
 */
@Repository
public class SWAccountDaoImpl implements SWAccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account queryAccountByName(String name) {
        return jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<>(Account.class), name);
    }

    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set money=? where id=?", account.getMoney(), account.getId());
    }
}
