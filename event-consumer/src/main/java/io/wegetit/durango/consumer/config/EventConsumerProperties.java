package io.wegetit.durango.consumer.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class EventConsumerProperties {
    @Min(10)
    @NotNull
    private Integer logBatchSize;
}
