package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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


    /**
     * 如果没有使用缓存中间件，Spring Boot 会使用默认的缓存，我们只需启用即可
     */
    @GetMapping
    @ApiOperation("测试缓存1")
    public void testCache(){
        
    }
}
