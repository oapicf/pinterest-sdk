package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting columns for sync reporting data filter
 */

public enum AdsAnalyticsFilterColumn {

    SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
    TOTAL_IMPRESSION("TOTAL_IMPRESSION");

    private String value;

    AdsAnalyticsFilterColumn(String value) {
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
    public static AdsAnalyticsFilterColumn fromValue(String text) {
        for (AdsAnalyticsFilterColumn b : AdsAnalyticsFilterColumn.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

