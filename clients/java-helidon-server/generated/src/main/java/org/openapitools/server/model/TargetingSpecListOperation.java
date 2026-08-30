package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingSpecListOperation
 */

public enum TargetingSpecListOperation {

    SET("SET"),
    ADD("ADD"),
    REMOVE("REMOVE");

    private String value;

    TargetingSpecListOperation(String value) {
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
    public static TargetingSpecListOperation fromValue(String text) {
        for (TargetingSpecListOperation b : TargetingSpecListOperation.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

