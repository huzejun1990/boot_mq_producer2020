package com.dream.boot.activemq.produce;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Queue;
import java.util.UUID;

/**
 * @Author: huzejun
 * @Date: 2021/1/2 0:26
 */
@Component
public class Queue_Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate; //队列生产
    @Resource
    private Queue queue; //对这个队列生产

    public void produceMsg() {
        jmsMessagingTemplate.convertAndSend(queue, "****:" + UUID.randomUUID().toString().substring(0, 8));
        System.out.println("*********** produce Msg task is over ***********");
    }

    /**
     * 间隔时间3秒钟定投
     */
    @Scheduled(fixedDelay = 3000)
    public void productMsgScheduled(){
        jmsMessagingTemplate.convertAndSend(queue, "****Scheduled:" + UUID.randomUUID().toString().substring(0, 8));
        System.out.println("*********** produce Scheduled Msg task is over ***********");
    }
}
