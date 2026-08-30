package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Filter operator for sync reporting
 */

public enum AdsAnalyticsFilterOperator {

    LESS_THAN("LESS_THAN"),
    GREATER_THAN("GREATER_THAN");

    private String value;

    AdsAnalyticsFilterOperator(String value) {
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
    public static AdsAnalyticsFilterOperator fromValue(String text) {
        for (AdsAnalyticsFilterOperator b : AdsAnalyticsFilterOperator.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

