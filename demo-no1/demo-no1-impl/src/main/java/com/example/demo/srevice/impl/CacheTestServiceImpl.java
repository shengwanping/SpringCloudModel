package com.example.demo.srevice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.CacheTestDao;
import com.example.demo.entity.UserEntity;
import com.example.demo.srevice.CacheTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.CheckForNull;

/**
 * @Filename: CacheTestServiceImpl
 * @Author: sheng.wanping
 * <li>Date: 2021/12/15 16:04</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service("cacheTestService")
public class CacheTestServiceImpl extends ServiceImpl<CacheTestDao, UserEntity> implements CacheTestService {

    @Autowired
    private CacheTestDao cacheTestDao;

    @Override
    public  UserEntity getData(Long id) {
        UserEntity userEntity = cacheTestDao.getData(id);
        if(userEntity == null){
            return null;
        }
        return userEntity;
    }
}
