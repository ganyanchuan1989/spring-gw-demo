package org.example.gw.gateway.filters.global;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * 无须编写而外配置
 */
@Component
public class MyGlobalFilters implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        Date date = new Date();
        System.out.println("全局路由过滤器，前置，当前时刻"+date.getTime());
        Mono<Void> result = chain.filter(exchange);
        Date date1 = new Date();
        System.out.println("全局路由过滤器，后置，当前时刻"+date1.getTime()+",执行时间："+(date1.getTime()-date.getTime()));
        return result;
    }
}
