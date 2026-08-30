package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ad group billable event type. For update, only draft ad groups may update billable event.
 */

public enum ActionType {

    CLICKTHROUGH("CLICKTHROUGH"),
    IMPRESSION("IMPRESSION"),
    VIDEO_V_50_MRC("VIDEO_V_50_MRC");

    private String value;

    ActionType(String value) {
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
    public static ActionType fromValue(String text) {
        for (ActionType b : ActionType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

