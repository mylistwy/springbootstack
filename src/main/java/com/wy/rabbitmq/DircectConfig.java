package com.wy.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

@Configuration
public class DircectConfig {
    @Bean
    public Queue paymentNotifyQueue(){
        return new Queue("notify.payment");
    }
}
