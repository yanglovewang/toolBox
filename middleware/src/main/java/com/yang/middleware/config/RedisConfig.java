package com.yang.middleware.config;

import com.yang.middleware.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

    public RedisTemplate<Object, User> redisTemplate() {

        return null;
    }
}
