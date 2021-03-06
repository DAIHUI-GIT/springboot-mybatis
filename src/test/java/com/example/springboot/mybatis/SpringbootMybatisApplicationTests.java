package com.example.springboot.mybatis;

import com.example.springboot.mybatis.entity.Log;
import com.example.springboot.mybatis.service.impl.LogServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    LogServiceImpl logServiceImpl;

    @Test
    void contextLoads() {

    }
    @Test
    void get() {
        List<Log> list = null;
        try {
            list = logServiceImpl.get();
            for (Log entity : list) {
                System.out.println(entity.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
