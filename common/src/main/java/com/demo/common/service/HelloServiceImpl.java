package com.demo.common.service;


import com.demo.common.domain.dto.User;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public User getExample1() {

        User order = new User();
        order.setCustomerId(12456);
        order.setCustomerName("张三");
        order.setPhoneNum("12332455656");
        order.setAge("12");
        order.setSex("男");
        return order;
    }

    @Override
    public User getExample2() {
        User order = new User();
        order.setCustomerId(124561221);
        order.setCustomerName("里斯");
        order.setPhoneNum("dsfgvdrfvbrt");
        order.setAge("1212");
        order.setSex("女");
        return order;
    }

    @Override
    public String getExample3() {

        return "qwew3f,123e23r4,12432r5,34r234,e23";
    }
}