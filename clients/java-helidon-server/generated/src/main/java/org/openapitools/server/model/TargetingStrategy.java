package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingStrategy
 */

public enum TargetingStrategy {

    CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
    FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
    RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

    private String value;

    TargetingStrategy(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TargetingStrategy fromValue(String text) {
        for (TargetingStrategy b : TargetingStrategy.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

