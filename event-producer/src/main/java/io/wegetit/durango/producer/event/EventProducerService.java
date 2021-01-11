package io.wegetit.durango.producer.event;

import io.wegetit.durango.producer.config.EventProducerProperties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@AllArgsConstructor
@Slf4j
public class EventProducerService {

    private final EventProducerProperties properties;

    @Scheduled(initialDelayString = "#{@eventProducerProperties.initialDelay}",
            fixedDelayString = "#{@eventProducerProperties.fixedDelay}")
    public void process() {
        RandomNumberEvent event = RandomNumberEvent.builder()
                .instance(properties.getInstance())
                .number(ThreadLocalRandom.current().nextInt())
                .build();
        log.info("Event send: {}", event);
    }
}
