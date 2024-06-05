package org.example.gw.config;

import com.netflix.discovery.shared.transport.jersey3.Jersey3TransportClientFactories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 解决：org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'scopedTarget.eurekaClient' defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration.class]: Unsatisfied dependency expressed through method 'eurekaClient' parameter 3: No qualifying bean of type 'com.netflix.discovery.shared.transport.jersey.TransportClientFactories<?>' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
@Configuration
public class Jersey3TransportClientFactoriesConfig {

    @Bean
    public Jersey3TransportClientFactories jersey3TransportClientFactories() {
        return new Jersey3TransportClientFactories();
    }

}