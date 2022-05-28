package com.example.provider.rpcservice;

import org.apache.dubbo.config.annotation.DubboService;
import service.EatService;

/**
 * [一句话描述该类的功能]
 *
 * @author qinshixin
 * @version 1.0.0
 * @createTime 2022/5/28 15
 */
@DubboService
public class EatServiceImpl implements EatService {
    
    @Override
    public void eatApple() {
        System.out.println("吃掉一个红苹果");
    }
}
