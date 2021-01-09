package io.wegetit.durango.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource("classpath:application.properties")
public class DurangoDataProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DurangoDataProducerApplication.class, args);
    }
}
