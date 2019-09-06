package com.dubbo.exe.service.impl;

import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder() {
        //1.查询用户地址
        List<UserAddress> userAddresses = userService.selectById(10);
        userAddresses.forEach(x->{
            System.out.println(x.getAddressName());
            System.out.println(x.getUserId());
        });
    }
}
