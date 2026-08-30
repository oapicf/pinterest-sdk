package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Product availability.
 */

public enum ProductAvailability {

    IN_STOCK("IN_STOCK"),
    OUT_OF_STOCK("OUT_OF_STOCK"),
    PREORDER("PREORDER");

    private String value;

    ProductAvailability(String value) {
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
    public static ProductAvailability fromValue(String text) {
        for (ProductAvailability b : ProductAvailability.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

