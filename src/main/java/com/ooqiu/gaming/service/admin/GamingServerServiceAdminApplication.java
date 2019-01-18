package com.ooqiu.gaming.service.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ooqiu.gaming.server.mapper")
public class GamingServerServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(GamingServerServiceAdminApplication.class,args);
    }
}
