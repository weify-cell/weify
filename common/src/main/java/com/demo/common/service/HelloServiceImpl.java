package com.demo.common.service;


import com.demo.common.domain.dto.Order;
import com.demo.common.service.HelloService;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public Order getExample1() {

        Order order = new Order();
        order.setCustomerId(12456);
        order.setCustomerName("张三");
        order.setPhoneNum("12332455656");
        order.setAge("12");
        order.setSex("男");
        return order;
    }

    @Override
    public Order getExample2() {
        Order order = new Order();
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