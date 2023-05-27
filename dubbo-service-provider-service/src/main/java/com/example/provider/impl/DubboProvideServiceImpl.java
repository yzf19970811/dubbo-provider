package com.example.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.example.provider.DubboProvideService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kyu.yzf
 * @date 2023/5/19 23:22
 */
@Service(version = "1.0.0")
public class DubboProvideServiceImpl implements DubboProvideService {

    @Override
    public String sayHello() {
        RpcContext context = RpcContext.getContext();
        String methodName = context.getMethodName();
        String localHost = context.getLocalHost();
        int localPort = context.getLocalPort();

        Map<String, String> map = new HashMap<>();
        map.put("methodName", methodName);
        map.put("localHost", localHost);
        map.put("localPort", String.valueOf(localPort));

        return map.toString();
    }
}
