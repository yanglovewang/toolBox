package com.yang.middleware;

import com.yang.middleware.dao.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDaoTest {

    @Autowired
    TestDao testDao;

    @Test
    public void test() {
        int userId = testDao.selectUserId(10019);
        String phone = testDao.selectUserName(10019);
        System.out.println(userId + " phone = " + phone);
    }
}
