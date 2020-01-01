package com.wy.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 添加两个消息发送类（生产者
 */
public class ApiCoreSendSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void user(String msg){
      System.err.println("api.core.user send message: "+msg);
      amqpTemplate.convertAndSend("coreExchange","api.core.user",msg);
    }

    public void userQuery(String msg){
        System.err.println("api.core.user.query send message: "+ msg);
        amqpTemplate.convertAndSend("coreExchange","api.core.user.query",msg); 
    }

}
