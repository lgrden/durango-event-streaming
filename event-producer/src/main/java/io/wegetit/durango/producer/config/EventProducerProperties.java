package io.wegetit.durango.producer.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class EventProducerProperties {
    @NotNull
    private String instance;
    @Min(0)
    @NotNull
    private Integer initialDelay;
    @Min(100)
    @NotNull
    private Integer fixedDelay;
    @Min(1)
    @NotNull
    private Integer batchSize;
}
