package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Entity status
 */

public enum NullableEntityStatus {

    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    ARCHIVED("ARCHIVED"),
    DRAFT("DRAFT"),
    DELETED_DRAFT("DELETED_DRAFT");

    private String value;

    NullableEntityStatus(String value) {
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
    public static NullableEntityStatus fromValue(String text) {
        for (NullableEntityStatus b : NullableEntityStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

