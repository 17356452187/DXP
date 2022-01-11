package com.huawei.data.exchange.platform.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.huawei.data.exchange.platform"})
public class DxpApplication {
    public static void main(String[] args) {
        SpringApplication.run(DxpApplication.class, args);
    }
}
