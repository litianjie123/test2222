package com.example.demo;

import com.example.demo.dao.entity.ForTest;
import com.example.demo.service.ParameterService;
import com.example.demo.service.UserService;
import com.example.demo.utils.JsonUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    private UserService userService;

    @Resource
    private ParameterService parameterService;

    @Test
    void contextLoads() {
    }


    @Test
    void test111() {
        // userService.forTestData();
        parameterService.getCurParameters();
    }


}
