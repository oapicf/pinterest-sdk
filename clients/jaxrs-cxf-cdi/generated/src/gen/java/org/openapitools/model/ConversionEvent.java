package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionEvent {

    @JsonProperty("PAGE_VISIT") PAGE_VISIT(String.valueOf("PAGE_VISIT")), @JsonProperty("SIGNUP") SIGNUP(String.valueOf("SIGNUP")), @JsonProperty("CHECKOUT") CHECKOUT(String.valueOf("CHECKOUT")), @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM")), @JsonProperty("VIEW_CATEGORY") VIEW_CATEGORY(String.valueOf("VIEW_CATEGORY")), @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")), @JsonProperty("ADD_TO_CART") ADD_TO_CART(String.valueOf("ADD_TO_CART")), @JsonProperty("WATCH_VIDEO") WATCH_VIDEO(String.valueOf("WATCH_VIDEO")), @JsonProperty("LEAD") LEAD(String.valueOf("LEAD")), @JsonProperty("APP_INSTALL") APP_INSTALL(String.valueOf("APP_INSTALL"));


    private String value;

    ConversionEvent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionEvent fromValue(String value) {
        for (ConversionEvent b : ConversionEvent.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



