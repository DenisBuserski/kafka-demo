package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "demo-topic", groupId = "groupDemo")
    void listener(String data) {
        System.out.println("Listener received: [" + data + "]");
    }
}
