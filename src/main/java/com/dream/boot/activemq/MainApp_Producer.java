package com.dream.boot.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.dream.boot.activemq")
@EnableScheduling
class MainApp_Producer {

    public static void main(String[] args) {
        SpringApplication.run(MainApp_Producer.class, args);
    }

}
