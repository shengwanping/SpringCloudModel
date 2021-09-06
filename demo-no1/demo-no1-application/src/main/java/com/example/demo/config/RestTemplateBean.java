package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * @author shengwanping
 * @Filename RestTemplateBean
 * @description
 * @Version 1.0
 * @History <li>Author: shengwanping</li>
 * <li>Date: 2021/8/26 16:21</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Configuration
public class RestTemplateBean {

    @Bean(name = "t")
    public RedisTemplate<String, Object> template(RedisConnectionFactory factory) {
        // 创建RedisTemplate<String, Object>对象
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        // 配置连接工厂
        template.setConnectionFactory(factory);
//        // 定义Jackson2JsonRedisSerializer序列化对象
//        Jackson2JsonRedisSerializer<Object> jacksonSeial = new Jackson2JsonRedisSerializer<>(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        // 指定要序列化的域，field,get和set,以及修饰符范围，ANY是都有包括private和public
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        // 指定序列化输入的类型，类必须是非final修饰的，final修饰的类，比如String,Integer等会报异常
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jacksonSeial.setObjectMapper(om);
//        StringRedisSerializer stringSerial = new StringRedisSerializer();
//        // redis key 序列化方式使用stringSerial
//        template.setKeySerializer(stringSerial);
//        // redis value 序列化方式使用jackson
//        template.setValueSerializer(jacksonSeial);
//        // redis hash key 序列化方式使用stringSerial
//        template.setHashKeySerializer(stringSerial);
//        // redis hash value 序列化方式使用jackson
//        template.setHashValueSerializer(jacksonSeial);
//        template.afterPropertiesSet();
        return template;
    }
}
