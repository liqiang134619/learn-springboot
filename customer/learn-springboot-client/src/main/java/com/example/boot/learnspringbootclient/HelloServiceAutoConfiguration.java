package com.example.boot.learnspringbootclient;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author Liq
 * @date 2020/1/8
 */
@Configuration
@ComponentScan("com.example.boot.learnspringbootclient.module")
@ConditionalOnProperty(prefix = "study",name = "enable",havingValue = "true")
public class HelloServiceAutoConfiguration {

}
