package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Order Line Paid Type
 */

public enum OrderLinePaidType {

    PAID("PAID"),
    BONUS("BONUS"),
    MAKE_GOOD("MAKE_GOOD"),
    TEST("TEST");

    private String value;

    OrderLinePaidType(String value) {
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
    public static OrderLinePaidType fromValue(String text) {
        for (OrderLinePaidType b : OrderLinePaidType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

