package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets NumericFilterOperatorType
 */

public enum NumericFilterOperatorType {

    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");

    private String value;

    NumericFilterOperatorType(String value) {
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
    public static NumericFilterOperatorType fromValue(String text) {
        for (NumericFilterOperatorType b : NumericFilterOperatorType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

