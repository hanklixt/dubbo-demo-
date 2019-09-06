package com.dubbo.exe;

import bean.UserAddress;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;
import service.UserService;

import java.io.IOException;
import java.util.List;

public class Consumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = ioc.getBean(OrderService.class);
        bean.initOrder();
        System.in.read();

    }
}
