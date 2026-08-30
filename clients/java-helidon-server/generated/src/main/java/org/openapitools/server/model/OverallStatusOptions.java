package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Overall status of event quality score.
 */

public enum OverallStatusOptions {

    NEEDS_IMPROVEMENT("NEEDS_IMPROVEMENT"),
    FAIR("FAIR"),
    GOOD("GOOD");

    private String value;

    OverallStatusOptions(String value) {
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
    public static OverallStatusOptions fromValue(String text) {
        for (OverallStatusOptions b : OverallStatusOptions.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

