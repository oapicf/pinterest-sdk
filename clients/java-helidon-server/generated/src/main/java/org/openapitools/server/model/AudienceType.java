package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Audience type
 */

public enum AudienceType {

    CUSTOMER_LIST("CUSTOMER_LIST"),
    VISITOR("VISITOR"),
    ENGAGEMENT("ENGAGEMENT"),
    ACTALIKE("ACTALIKE"),
    PERSONA("PERSONA");

    private String value;

    AudienceType(String value) {
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
    public static AudienceType fromValue(String text) {
        for (AudienceType b : AudienceType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

