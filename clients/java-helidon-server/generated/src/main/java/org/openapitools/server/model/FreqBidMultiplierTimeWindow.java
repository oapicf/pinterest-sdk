package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The time window for frequency bid multipliers.
 */

public enum FreqBidMultiplierTimeWindow {

    WEEK("WEEK"),
    MONTH("MONTH");

    private String value;

    FreqBidMultiplierTimeWindow(String value) {
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
    public static FreqBidMultiplierTimeWindow fromValue(String text) {
        for (FreqBidMultiplierTimeWindow b : FreqBidMultiplierTimeWindow.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

