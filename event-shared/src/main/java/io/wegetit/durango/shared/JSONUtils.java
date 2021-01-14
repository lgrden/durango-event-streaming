package io.wegetit.durango.shared;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {
    private final static ObjectMapper MAPPER = new ObjectMapper();

    private JSONUtils() {}

    public static String asString(Object o) throws JsonProcessingException {
        return MAPPER.writeValueAsString(o);
    }

    public static <T> T asObject(String s, Class<T> tClass) throws JsonProcessingException {
        return MAPPER.readValue(s, tClass);
    }
}
