package com.example.provider.rpcservice;

import org.apache.dubbo.config.annotation.DubboService;
import service.SayService;

/**
 * [一句话描述该类的功能]
 *
 * @author qinshixin
 * @version 1.0.0
 * @createTime 2022/5/27 18
 */
@DubboService
public class SayServiceImpl implements SayService {
    
    @Override
    public String say() {
        return "say: hello 哈哈哈哈哈";
    }
}
