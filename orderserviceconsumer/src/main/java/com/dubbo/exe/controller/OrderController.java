package com.dubbo.exe.controller;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @Reference(timeout = 1000,version = "2.0.0")
    UserService UserService;

    @HystrixCommand(fallbackMethod = "hello")
    @GetMapping("/getUserAddressById/{id}")
    public List<UserAddress> getUserAddressById(@PathVariable("id") Integer id){
     // orderService.initOrder();
       List<UserAddress> userAddresses = UserService.selectById(id);
        return userAddresses;
    }

    public List<UserAddress> hello( Integer id){
        // orderService.initOrder();
        UserAddress userAddress = new UserAddress();
        userAddress.setAddressName("百度总部");
        ArrayList<UserAddress> userAddresses = new ArrayList<>();
        userAddresses.add(userAddress);
        return userAddresses;
    }
}
