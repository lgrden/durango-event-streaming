package io.wegetit.durango.shared;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class RandomNumberEvent {
    public static final String TOPIC = "RandomNumber";

    private String instance;
    private Integer number;
}
