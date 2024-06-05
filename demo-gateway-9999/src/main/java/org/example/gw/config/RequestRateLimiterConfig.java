package org.example.gw.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RequestRateLimiterConfig {
    /**
     * 按IP来限流
     */
    @Bean
    public KeyResolver ipAddrKeyResolver() {//JDK8的新特性——Lambda表达式
        return exchange -> {
            String addr = exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
            System.out.println(">>>>:"+addr);
            return Mono.just(addr);
        };
    }
}
