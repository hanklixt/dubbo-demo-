package com.dubbo.exe.service.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;
import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
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
