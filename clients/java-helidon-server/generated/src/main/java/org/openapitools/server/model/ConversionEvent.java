package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ConversionEvent
 */

public enum ConversionEvent {

    PAGE_VISIT("PAGE_VISIT"),
    SIGNUP("SIGNUP"),
    CHECKOUT("CHECKOUT"),
    CUSTOM("CUSTOM"),
    VIEW_CATEGORY("VIEW_CATEGORY"),
    SEARCH("SEARCH"),
    ADD_TO_CART("ADD_TO_CART"),
    WATCH_VIDEO("WATCH_VIDEO"),
    LEAD("LEAD"),
    APP_INSTALL("APP_INSTALL");

    private String value;

    ConversionEvent(String value) {
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
    public static ConversionEvent fromValue(String text) {
        for (ConversionEvent b : ConversionEvent.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

