package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Entity status
 */

public enum NonDraftEntityStatus {

    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    ARCHIVED("ARCHIVED");

    private String value;

    NonDraftEntityStatus(String value) {
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
    public static NonDraftEntityStatus fromValue(String text) {
        for (NonDraftEntityStatus b : NonDraftEntityStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

