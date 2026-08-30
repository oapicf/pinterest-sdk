package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PinFilter {

    @JsonProperty("exclude_native") EXCLUDE_NATIVE(String.valueOf("exclude_native")), @JsonProperty("exclude_repins") EXCLUDE_REPINS(String.valueOf("exclude_repins")), @JsonProperty("has_been_promoted") HAS_BEEN_PROMOTED(String.valueOf("has_been_promoted"));


    private String value;

    PinFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PinFilter fromValue(String value) {
        for (PinFilter b : PinFilter.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



