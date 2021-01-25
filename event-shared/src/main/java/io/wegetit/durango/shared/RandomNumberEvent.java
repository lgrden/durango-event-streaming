package io.wegetit.durango.shared;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RandomNumberEvent {
    public static final String TOPIC = "random-number";

    private String instance;
    private String id;
    private Integer number;
}
