package io.wegetit.durango.producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.wegetit.durango.producer.config.EventProducerProperties;
import io.wegetit.durango.shared.JSONUtils;
import io.wegetit.durango.shared.RandomNumberEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.ThreadLocalRandom;

@Service
@AllArgsConstructor
@Slf4j
public class EventProducerService {

    private final EventProducerProperties properties;
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Scheduled(initialDelayString = "#{@eventProducerProperties.initialDelay}",
            fixedDelayString = "#{@eventProducerProperties.fixedDelay}")
    private void process() throws JsonProcessingException {
        String message = JSONUtils.asString(RandomNumberEvent.builder()
                .instance(properties.getInstance())
                .number(ThreadLocalRandom.current().nextInt())
                .build());

        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(RandomNumberEvent.TOPIC, message);
        future.addCallback(c -> log.info("Sent message: {}", message), c -> {});
    }
}
