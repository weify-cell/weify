package com.demo.common;

import com.demo.common.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommonApplicationTests {


    @Autowired
    private UserDao userDto;

    @Test
    void contextLoads() {
    }


    @Test
    public void testMysqlConnect(){
        userDto.updateUser();
    }

}
