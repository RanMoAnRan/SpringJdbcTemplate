package com.jing.shiwu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:swapplication.xml"})
public class SWAccountServiceImplTest {
    @Autowired
    private SWAccountService swAccountService;

    @Test
    public void transfer() {
        swAccountService.transfer("aaa","bbb",100f);
    }
}