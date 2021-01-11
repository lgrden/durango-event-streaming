package io.wegetit.durango.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class DurangoDataConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DurangoDataConsumerApplication.class, args);
    }
}
