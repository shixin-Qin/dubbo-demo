package com.example.consumerdemo.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EatService;
import service.SayService;

/**
 * [一句话描述该类的功能]
 *
 * @author qinshixin
 * @version 1.0.0
 * @createTime 2022/5/27 20
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    
    @DubboReference
    private SayService sayService;
    
    @DubboReference
    private EatService eatService;

    @GetMapping("/say")
    public String say(){
        return sayService.say();
    }
    
    @GetMapping("/eatApple")
    public void eatApple(){
        eatService.eatApple();
    }
}
