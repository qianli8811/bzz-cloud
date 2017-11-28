package com.star.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * class_name: $
 * package: com.star.cloud.core$
 * desc: TODO
 * author : yang qian li
 * creat_time: 2017-11-19 23:24
 */
@SpringBootApplication
@EnableConfigurationProperties
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.star.cloud"})
@Configuration
public class AppStarCore {
    public static void main(String[] args) {
        SpringApplication.run(AppStarCore.class, args);
    }
}
