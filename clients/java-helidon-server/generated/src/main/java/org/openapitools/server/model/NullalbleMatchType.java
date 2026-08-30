package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Keyword match type allowing null
 */

public enum NullalbleMatchType {

    BROAD("BROAD"),
    PHRASE("PHRASE"),
    EXACT("EXACT"),
    EXACT_NEGATIVE("EXACT_NEGATIVE"),
    PHRASE_NEGATIVE("PHRASE_NEGATIVE");

    private String value;

    NullalbleMatchType(String value) {
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
    public static NullalbleMatchType fromValue(String text) {
        for (NullalbleMatchType b : NullalbleMatchType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

