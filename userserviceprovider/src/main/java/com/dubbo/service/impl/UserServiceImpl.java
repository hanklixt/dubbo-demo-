package com.dubbo.service.impl;


import bean.UserAddress;
import service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    public List<UserAddress> selectById(Integer id) {
        UserAddress address=new UserAddress();
        address.setAddressName("北京四合院");
        address.setAge(52);
        address.setYear(10);
        address.setUserId(id);
        UserAddress address1=new UserAddress();
        address1.setAddressName("陕西窑洞");
        address.setYear(54);
        address.setAge(86);
        address1.setUserId(id);
        return Arrays.asList(address,address1);
    }
}
