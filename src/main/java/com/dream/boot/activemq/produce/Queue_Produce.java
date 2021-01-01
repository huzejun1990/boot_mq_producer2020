package com.dream.boot.activemq.produce;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

/**
 * @Author: huzejun
 * @Date: 2021/1/2 0:26
 */
@Component
public class Queue_Produce {

    private final JmsMessagingTemplate jmsMessagingTemplate;

    private final Queue queue;

    public Queue_Produce(JmsMessagingTemplate jmsMessagingTemplate, Queue queue) {
        this.jmsMessagingTemplate = jmsMessagingTemplate;
        this.queue = queue;
    }

    public void produceMsg(){
        jmsMessagingTemplate.convertAndSend(queue,"****: "+ UUID.randomUUID().toString().substring(0,6));
    }

}
