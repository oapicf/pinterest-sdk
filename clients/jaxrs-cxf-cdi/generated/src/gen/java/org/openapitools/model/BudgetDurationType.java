package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Budget duration type for delivery estimates.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BudgetDurationType {

    @JsonProperty("FIXED_DAILY") FIXED_DAILY(String.valueOf("FIXED_DAILY")), @JsonProperty("FLEXIBLE_DAILY") FLEXIBLE_DAILY(String.valueOf("FLEXIBLE_DAILY")), @JsonProperty("LIFETIME") LIFETIME(String.valueOf("LIFETIME"));


    private String value;

    BudgetDurationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BudgetDurationType fromValue(String value) {
        for (BudgetDurationType b : BudgetDurationType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



