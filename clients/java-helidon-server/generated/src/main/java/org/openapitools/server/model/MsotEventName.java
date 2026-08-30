package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of user conversion event.
 */

public enum MsotEventName {

    ADD_TO_CART("add_to_cart"),
    CHECKOUT("checkout"),
    LEAD("lead"),
    SIGNUP("signup");

    private String value;

    MsotEventName(String value) {
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
    public static MsotEventName fromValue(String text) {
        for (MsotEventName b : MsotEventName.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

