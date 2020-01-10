package com.example.boot.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liq
 * @date 2020/1/10
 */
@RestController
public class BaseController {


    @Autowired
    StringRedisTemplate stringRedisTemplate;



    @GetMapping("/hello")
    public String helli() {

//        stringRedisTemplate.opsForValue().set("key","value");
//        String s = stringRedisTemplate.opsForValue().get("key");
        Boolean key = stringRedisTemplate.opsForValue().getOperations().delete("key");

        System.out.println(key);
        return "x";
//        System.out.println(s);
//        return s;
    }

}
