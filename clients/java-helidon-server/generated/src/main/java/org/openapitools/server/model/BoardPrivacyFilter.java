package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BoardPrivacyFilter
 */

public enum BoardPrivacyFilter {

    ALL("ALL"),
    PUBLIC("PUBLIC"),
    PROTECTED("PROTECTED"),
    SECRET("SECRET"),
    PUBLIC_AND_SECRET("PUBLIC_AND_SECRET");

    private String value;

    BoardPrivacyFilter(String value) {
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
    public static BoardPrivacyFilter fromValue(String text) {
        for (BoardPrivacyFilter b : BoardPrivacyFilter.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

