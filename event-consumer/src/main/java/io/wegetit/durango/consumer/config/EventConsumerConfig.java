package io.wegetit.durango.consumer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
public class EventConsumerConfig {

    @Validated
    @Bean
    @ConfigurationProperties(prefix = "consumer")
    public EventConsumerProperties eventProducerProperties() {
        return new EventConsumerProperties();
    }
}
