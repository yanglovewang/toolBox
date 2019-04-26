package com.yang.middleware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    StringRedisTemplate stringRedisTemplate; //k-v 都是字符串

    @Autowired
    RedisTemplate redisTemplate; // k-v 都是对象


    @Test
    public void redisTest() {
        stringRedisTemplate.opsForValue().append("yang", "zhang");
    }

    @Test
    public  void redisTest2() {
        stringRedisTemplate.opsForHash().put("wang", "key", "value");
    }

    @Test
    public  void redisSelectTest() {

    }

    @Test
    public  void redisLockTest() {
    }



    /**
     * redis 如果保存对象，默认是jdk序列化的机制，难看
     */
}
