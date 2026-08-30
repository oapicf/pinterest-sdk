package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EnhancedMatchStatusType
 */

public enum EnhancedMatchStatusType {

    UNKNOWN("UNKNOWN"),
    NOT_VALIDATED("NOT_VALIDATED"),
    VALIDATING_IN_PROGRESS("VALIDATING_IN_PROGRESS"),
    VALIDATION_COMPLETE("VALIDATION_COMPLETE");

    private String value;

    EnhancedMatchStatusType(String value) {
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
    public static EnhancedMatchStatusType fromValue(String text) {
        for (EnhancedMatchStatusType b : EnhancedMatchStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

