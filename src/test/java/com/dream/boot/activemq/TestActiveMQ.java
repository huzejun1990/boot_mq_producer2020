package com.dream.boot.activemq;

import com.dream.boot.activemq.produce.Queue_Producer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = MainApp_Producer.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
class TestActiveMQ {

    @Resource
    private Queue_Producer queue_produce;

    @Test
    public void testSend() throws Exception {
        queue_produce.produceMsg();
//        queue_produce.producerMsg();
    }

}
