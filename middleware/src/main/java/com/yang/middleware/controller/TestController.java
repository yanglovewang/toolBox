package com.yang.middleware.controller;

import com.yang.middleware.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/index")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/user")
    public String selectUserName() {
        String s = testService.selectUserName(10029);
        return s;
    }

}
