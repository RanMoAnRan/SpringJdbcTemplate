package com.jing.shiwu.service;

/**
 * @ClassName:SWAccountService
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/21 16:24
 * @Version 1.0
 */
public interface SWAccountService {
    void transfer(String sourceName, String targetName, Float money);
}
