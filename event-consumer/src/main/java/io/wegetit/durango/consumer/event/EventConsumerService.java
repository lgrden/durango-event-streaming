package io.wegetit.durango.consumer.event;

import io.wegetit.durango.consumer.config.EventConsumerProperties;
import io.wegetit.durango.shared.RandomNumberEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@AllArgsConstructor
@Service
@Slf4j
public class EventConsumerService {

    private final EventConsumerProperties properties;
    private final AtomicInteger count = new AtomicInteger();

    @KafkaListener(topics = RandomNumberEvent.TOPIC)
    public void listener(List<RandomNumberEvent> list) {
        if (count.addAndGet(list.size()) >= properties.getLogBatchSize()) {
            log.info("Received {} events.", properties.getLogBatchSize());
            count.addAndGet(-1* properties.getLogBatchSize());
        }
    }
}
