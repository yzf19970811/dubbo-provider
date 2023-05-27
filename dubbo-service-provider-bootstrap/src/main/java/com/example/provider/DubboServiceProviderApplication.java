package com.example.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author kyu.yzf
 * @date 2023/5/19 23:18
 */
@SpringBootApplication
@EnableDubbo
@ImportResource(locations={"classpath*:spring/*.xml"})
public class DubboServiceProviderApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DubboServiceProviderApplication.class);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
