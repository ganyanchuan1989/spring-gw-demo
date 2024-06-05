package org.example.gw.gateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Component
public class MyRequestPathGatewayFilterFactory
        extends AbstractGatewayFilterFactory<MyRequestPathGatewayFilterFactory.Config> {

    // 重写无参构造函数，提供配置类信息
    public MyRequestPathGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("name", "path");
    }

    @Override
    public GatewayFilter apply(Config config) {

        return new GatewayFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                String path = exchange.getRequest().getPath().toString();
                System.out.println("自定义过滤器，本次路由的请求地址："+path+",请求参数,name:"+config.getName()+",path:"+config.getPath());
                Mono<Void> result = chain.filter(exchange);

                return result;
            }
        };
    }

    public static class Config {
        private String name;
        private String path;

        public String getPath() {
            return path;
        }

        public Config setPath(String path) {
            this.path = path;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
