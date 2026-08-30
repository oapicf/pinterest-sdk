package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Filter audiences by ownership type.
 */

public enum AudienceOwnershipType {

    OWNED("OWNED"),
    RECEIVED("RECEIVED");

    private String value;

    AudienceOwnershipType(String value) {
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
    public static AudienceOwnershipType fromValue(String text) {
        for (AudienceOwnershipType b : AudienceOwnershipType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

