package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The names of fields that business accounts are searched by
 */

public enum BusinessSearchBy {

    FULL_NAME("FULL_NAME"),
    USERNAME("USERNAME"),
    BUSINESS_ID("BUSINESS_ID"),
    EMAIL("EMAIL");

    private String value;

    BusinessSearchBy(String value) {
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
    public static BusinessSearchBy fromValue(String text) {
        for (BusinessSearchBy b : BusinessSearchBy.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

