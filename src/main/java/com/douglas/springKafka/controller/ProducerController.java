package com.douglas.springKafka.controller;

import com.douglas.springKafka.product.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/producer/{name}/{value}/{owner}")
    public void producer (@PathVariable String name, @PathVariable Double value, @PathVariable String owner)
            throws JsonProcessingException {
        Product product = new Product(name, value, owner);

        this.kafkaTemplate.send("ecomerce.cliente2", objectMapper.writeValueAsString(product));
    }
}
