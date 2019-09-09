package com.dubbo.exe;

import bean.UserAddress;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;
import service.UserService;

import java.io.IOException;
import java.util.List;

@EnableDubbo
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class ConsumerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ConsumerApplication.class,args);

    }
}
