package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Keyword match type
 */

public enum MatchTypeResponse {

    BROAD("BROAD"),
    PHRASE("PHRASE"),
    EXACT("EXACT"),
    EXACT_NEGATIVE("EXACT_NEGATIVE"),
    PHRASE_NEGATIVE("PHRASE_NEGATIVE");

    private String value;

    MatchTypeResponse(String value) {
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
    public static MatchTypeResponse fromValue(String text) {
        for (MatchTypeResponse b : MatchTypeResponse.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

