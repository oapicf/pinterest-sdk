package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Quiz ad tie breaker type, default is RANDOM
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TieBreakerType {

    @JsonProperty("RANDOM") RANDOM(String.valueOf("RANDOM")), @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    TieBreakerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TieBreakerType fromValue(String value) {
        for (TieBreakerType b : TieBreakerType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



