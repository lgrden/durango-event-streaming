package io.wegetit.durango.consumer.event;

import io.wegetit.durango.shared.RandomNumberEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventConsumerService {

    @KafkaListener(topics = RandomNumberEvent.TOPIC)
    private void listener(String data) {
        log.info("Received {}", data);
    }
}
