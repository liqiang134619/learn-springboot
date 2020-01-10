package com.example.boot.learnspringbootclient.module;

import org.springframework.stereotype.Component;

/**
 * @author Liq
 * @date 2020/1/8
 */
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "hello";
    }
}
