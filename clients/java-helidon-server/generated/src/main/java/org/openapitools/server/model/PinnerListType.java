package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Audience type
 */

public enum PinnerListType {

    CUSTOMER_LIST("CUSTOMER_LIST"),
    VISITOR("VISITOR"),
    ENGAGEMENT("ENGAGEMENT"),
    LOOKALIKE("LOOKALIKE"),
    ACTALIKE("ACTALIKE"),
    PERSONA("PERSONA");

    private String value;

    PinnerListType(String value) {
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
    public static PinnerListType fromValue(String text) {
        for (PinnerListType b : PinnerListType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

