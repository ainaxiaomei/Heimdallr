package com.asia.heimdallr.as.meta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
public class MetaServiceBootstrap {


    public static void main(String[] args) { 
        SpringApplication.run(MetaServiceBootstrap.class);
    }

} 