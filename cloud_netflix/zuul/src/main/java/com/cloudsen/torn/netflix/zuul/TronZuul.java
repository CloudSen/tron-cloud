package com.cloudsen.torn.netflix.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关
 *
 * @author CloudS3n
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class TronZuul {
    public static void main(String[] args) {
        SpringApplication.run(TronZuul.class, args);
    }
}
