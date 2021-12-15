package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @Filename: CacheTestDao
 * @Author: sheng.wanping
 * <li>Date: 2021/12/15 16:11</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Repository
public interface CacheTestDao extends BaseMapper<UserEntity> {

    UserEntity getData(Long id);
}
