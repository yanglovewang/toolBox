package com.yang.middleware.service;

import com.yang.middleware.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public String selectUserName(int id) {
        return testDao.selectUserName(id);
    }
}
