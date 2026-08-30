package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Budget duration type for delivery estimates.
 */

public enum BudgetDurationType {

    FIXED_DAILY("FIXED_DAILY"),
    FLEXIBLE_DAILY("FLEXIBLE_DAILY"),
    LIFETIME("LIFETIME");

    private String value;

    BudgetDurationType(String value) {
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
    public static BudgetDurationType fromValue(String text) {
        for (BudgetDurationType b : BudgetDurationType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

