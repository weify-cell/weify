package com.demo.common;

import com.demo.common.dao.UserDao;
import com.demo.common.domain.dto.User;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

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


    @Test
    public void testAddUserData(){


        Gson gson = new Gson();
        List<User> userList = new ArrayList<>();

        for(int i = 4500; i < 6000;i++){
            User user = new User(i, "李大" + i, String.valueOf( (int) (Math.random() * 10000) ), String.valueOf(((int)  (Math.random() * 1000) % 3)), String.valueOf((int) (Math.random() * 100)));
            userList.add(user);
            System.out.println(gson.toJson(user));
        }

        userDto.batchInsertUserData(userList);

    }

}
