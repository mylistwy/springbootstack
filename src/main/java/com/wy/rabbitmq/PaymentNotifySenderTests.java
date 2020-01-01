package com.wy.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentNotifySenderTests {
    @Autowired
    private PaymentNotifySender sender;

    @Test
    public void test_sender(){
        sender.sender("支付订单号： "+System.currentTimeMillis());
    }
}
