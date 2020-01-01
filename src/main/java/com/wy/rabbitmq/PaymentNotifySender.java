package com.wy.rabbitmq;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 */
@Component
public class PaymentNotifySender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sender(String msg){
        System.err.println("notity.payment send message: "+ msg);
        amqpTemplate.convertAndSend("notify.payment",msg);
    }
}
