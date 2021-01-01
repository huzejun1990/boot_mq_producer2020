package com.dream.boot.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


/**
 * @Author: huzejun
 * @Date: 2021/1/2 0:12
 */
@Component
@EnableJms
public class ConfigBean {

//    @Value("${myqueue}")
    @Value("myQueue")
    private String myQueue;

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(myQueue);
    }

/*    @Value("")
    private String myQueueName;*/
}
