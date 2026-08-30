package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The schedule action
 */

public enum ScheduleAction {

    INCREASE_BY_VALUE("INCREASE_BY_VALUE"),
    INCREASE_BY_PERCENT("INCREASE_BY_PERCENT");

    private String value;

    ScheduleAction(String value) {
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
    public static ScheduleAction fromValue(String text) {
        for (ScheduleAction b : ScheduleAction.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

