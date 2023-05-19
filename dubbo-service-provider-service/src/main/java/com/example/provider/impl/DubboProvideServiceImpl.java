package com.example.provider.impl;

import com.example.provider.DubboProvideService;

/**
 * @author kyu.yzf
 * @date 2023/5/19 23:22
 */
public class DubboProvideServiceImpl implements DubboProvideService {

    @Override
    public String sayHello() {
        return "hello, call dubbo service success!!!";
    }
}
