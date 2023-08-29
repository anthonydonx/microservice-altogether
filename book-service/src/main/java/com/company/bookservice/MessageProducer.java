package com.company.bookservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author asankaa
 */

@Component
@Slf4j
public class MessageProducer {
    @Autowired
    private StreamBridge streamBridge;

    @Scheduled(fixedRate = 1000)
    public void produce() {
        log.info("Sending message to bookSupplier-out-0");
        this.streamBridge.send("bookConsumer-group", new MessageDto("Hello from BookService @Scheduled"));
    }
}
