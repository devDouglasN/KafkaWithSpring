package com.douglas.springKafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "ecomerce.cliente2", groupId = "ecomerce-groupid")
    public void consumer (String message) {
        System.out.println(message);
    }
}
