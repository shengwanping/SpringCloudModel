package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.srevice.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author shengwanping
 * @Filename RedisTest
 * @description
 * @Version 1.0
 * @History <li>Author: shengwanping</li>
 * <li>Date: 2021/8/26 15:12</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RequestMapping
@RestController
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisOperations redisTemplate;

    @Autowired
    private RedisTemplate<String, Object> t;

    @Autowired
    private  RedisConnectionFactory factory;

    @GetMapping("/aaaa")
    public void test002() {
        ValueOperations<String, Object> redisString =  redisTemplate.opsForValue();
        // SET key value: 设置指定 key 的值
        redisString.set("strKey3", "hello spring boot redis");
        // GET key: 获取指定 key 的值
        String value = (String) redisString.get("strKey1");
        System.out.println(value);

        redisString.set("strKey2", new UserEntity("小红", 023, new Date()));
        UserEntity user = (UserEntity) redisString.get("strKey2");
        System.out.println(user);
    }
}
