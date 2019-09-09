package com.dubbo.exe.controller;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;
import service.UserService;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @Reference(timeout = 1000)
    UserService UserService;

    @GetMapping("/getUserAddressById/{id}")
    public List<UserAddress> getUserAddressById(@PathVariable("id") Integer id){
     // orderService.initOrder();
        List<UserAddress> userAddresses = UserService.selectById(id);
        return userAddresses;
    }
}
