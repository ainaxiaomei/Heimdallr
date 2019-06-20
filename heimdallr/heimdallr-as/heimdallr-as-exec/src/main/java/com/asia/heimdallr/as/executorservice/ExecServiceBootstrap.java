package com.asia.heimdallr.as.executorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
public class ExecServiceBootstrap {


    public static void main(String[] args) { 
        SpringApplication.run(ExecServiceBootstrap.class);
    }

} 