package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The schedule type
 */

public enum ScheduleType {

    CAMPAIGN_BUDGET_CHANGE("CAMPAIGN_BUDGET_CHANGE"),
    CAMPAIGN_BID_MULTIPLIERS("CAMPAIGN_BID_MULTIPLIERS");

    private String value;

    ScheduleType(String value) {
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
    public static ScheduleType fromValue(String text) {
        for (ScheduleType b : ScheduleType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

