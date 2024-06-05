package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
// 启动配置中心服务
@EnableConfigServer
public class DemoConfigServer6666 {
    public static void main(String[] args) {
        SpringApplication.run(DemoConfigServer6666.class, args);
    }
}