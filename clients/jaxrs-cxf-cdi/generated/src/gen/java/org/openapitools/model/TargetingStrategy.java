package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TargetingStrategy {

    @JsonProperty("CHOOSE_YOUR_OWN") CHOOSE_YOUR_OWN(String.valueOf("CHOOSE_YOUR_OWN")), @JsonProperty("FIND_NEW_CUSTOMERS") FIND_NEW_CUSTOMERS(String.valueOf("FIND_NEW_CUSTOMERS")), @JsonProperty("RECONNECT_WITH_USERS") RECONNECT_WITH_USERS(String.valueOf("RECONNECT_WITH_USERS"));


    private String value;

    TargetingStrategy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TargetingStrategy fromValue(String value) {
        for (TargetingStrategy b : TargetingStrategy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



