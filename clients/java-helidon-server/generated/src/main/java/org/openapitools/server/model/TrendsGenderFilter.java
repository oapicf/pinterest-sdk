package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gender category for trends demographic distribution.
 */

public enum TrendsGenderFilter {

    MALE("male"),
    FEMALE("female"),
    UNKNOWN("unknown");

    private String value;

    TrendsGenderFilter(String value) {
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
    public static TrendsGenderFilter fromValue(String text) {
        for (TrendsGenderFilter b : TrendsGenderFilter.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

