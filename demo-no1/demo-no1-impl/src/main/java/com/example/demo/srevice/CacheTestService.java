package com.example.demo.srevice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.UserEntity;
import org.springframework.validation.annotation.Validated;

/**
 * @Filename: CacheTestService
 * @Author: sheng.wanping
 * <li>Date: 2021/12/15 16:03</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Validated
public interface CacheTestService extends IService<UserEntity> {

    UserEntity getData(Long id);
}
