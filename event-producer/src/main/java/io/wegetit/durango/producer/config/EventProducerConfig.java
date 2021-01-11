package io.wegetit.durango.producer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
public class EventProducerConfig {

    @Validated
    @Bean
    @ConfigurationProperties(prefix = "producer")
    public EventProducerProperties eventProducerProperties() {
        return new EventProducerProperties();
    }
}
