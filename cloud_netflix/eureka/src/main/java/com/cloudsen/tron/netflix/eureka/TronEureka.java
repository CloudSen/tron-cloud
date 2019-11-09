package com.cloudsen.tron.netflix.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

/**
 * Eureka 注册中心
 *
 * @author CloudS3n
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class TronEureka {

    static {
        log.info("[ EUREKA ] Starting eureka registration center...");
    }

    @ConditionalOnMissingBean
    @Bean
    public HttpTraceRepository httpTraceRepository() {
        return new InMemoryHttpTraceRepository();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(TronEureka.class)
            .web(WebApplicationType.SERVLET)
            .run(args);
    }
}
