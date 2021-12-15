package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.srevice.CacheTestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Filename: CacheTestController
 * @Author: sheng.wanping
 * <li>Date: 2021/12/15 16:02</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RequestMapping("/api/vi/cacheTestController")
@RestController
public class CacheTestController {

    @Autowired
    private CacheTestService cacheTestService;

    /**
     * 如果没有使用缓存中间件，Spring Boot 会使用默认的缓存，我们只需启用即可
     */
    @GetMapping
    @ApiOperation("测试缓存1")
    public UserEntity testCache(@RequestParam Long id){
        return cacheTestService.getData(id);
    }
}

