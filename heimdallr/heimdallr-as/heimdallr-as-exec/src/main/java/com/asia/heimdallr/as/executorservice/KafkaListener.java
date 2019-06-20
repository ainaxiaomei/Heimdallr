package com.asia.heimdallr.as.executorservice;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {
	@KafkaListener(topics = "someTopic")
    public void processMessage(String content) {
        // ...
    }
}
