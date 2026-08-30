package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Availability of the item
 */

public enum ItemAvailability {

    IN_STOCK("in stock"),
    OUT_OF_STOCK("out of stock"),
    PREORDER("preorder");

    private String value;

    ItemAvailability(String value) {
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
    public static ItemAvailability fromValue(String text) {
        for (ItemAvailability b : ItemAvailability.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

