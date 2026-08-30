package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Audience processing status
 */

public enum AudienceStatus {

    INITIALIZING("INITIALIZING"),
    READY("READY"),
    TOO_SMALL("TOO_SMALL"),
    ELIGIBLE("ELIGIBLE"),
    PERSONAS_INELIGIBLE_SIZE("PERSONAS_INELIGIBLE_SIZE"),
    PERSONAS_INITIALIZING("PERSONAS_INITIALIZING");

    private String value;

    AudienceStatus(String value) {
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
    public static AudienceStatus fromValue(String text) {
        for (AudienceStatus b : AudienceStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

