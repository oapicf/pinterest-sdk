package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Discount status based on the current time and start and end time of discount
 */

public enum DiscountStatus {

    OTHER("OTHER"),
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    SCHEDULED("SCHEDULED"),
    EXPIRED("EXPIRED");

    private String value;

    DiscountStatus(String value) {
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
    public static DiscountStatus fromValue(String text) {
        for (DiscountStatus b : DiscountStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

