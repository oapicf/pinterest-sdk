package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TargetingSpecListOperation {

    @JsonProperty("SET") SET(String.valueOf("SET")), @JsonProperty("ADD") ADD(String.valueOf("ADD")), @JsonProperty("REMOVE") REMOVE(String.valueOf("REMOVE"));


    private String value;

    TargetingSpecListOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TargetingSpecListOperation fromValue(String value) {
        for (TargetingSpecListOperation b : TargetingSpecListOperation.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



