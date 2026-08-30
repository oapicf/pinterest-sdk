package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Sort metric for top pins analytics.
 */

public enum TopPinsSortBy {

    ENGAGEMENT("ENGAGEMENT"),
    SAVE("SAVE"),
    IMPRESSION("IMPRESSION"),
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    PIN_CLICK("PIN_CLICK");

    private String value;

    TopPinsSortBy(String value) {
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
    public static TopPinsSortBy fromValue(String text) {
        for (TopPinsSortBy b : TopPinsSortBy.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

