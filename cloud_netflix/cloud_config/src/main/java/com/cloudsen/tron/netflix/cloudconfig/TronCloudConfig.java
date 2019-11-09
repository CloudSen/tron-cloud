package com.cloudsen.tron.netflix.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心
 *
 * @author CloudS3n
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class TronCloudConfig {

    public static void main(String[] args) {
        SpringApplication.run(TronCloudConfig.class, args);
    }
}
