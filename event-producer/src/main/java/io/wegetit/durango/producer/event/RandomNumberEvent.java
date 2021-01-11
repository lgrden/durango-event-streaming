package io.wegetit.durango.producer.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class RandomNumberEvent {
    private String instance;
    private Integer number;
}
