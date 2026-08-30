package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * oCPM learn mode.
 */

public enum ConversionLearningModeType {

    NOT_ACTIVE("NOT_ACTIVE"),
    ACTIVE("ACTIVE");

    private String value;

    ConversionLearningModeType(String value) {
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
    public static ConversionLearningModeType fromValue(String text) {
        for (ConversionLearningModeType b : ConversionLearningModeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

