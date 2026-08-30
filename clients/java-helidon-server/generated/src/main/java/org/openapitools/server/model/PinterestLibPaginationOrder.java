package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Pinterest.Lib.PaginationOrder
 */

public enum PinterestLibPaginationOrder {

    ASCENDING("ASCENDING"),
    DESCENDING("DESCENDING");

    private String value;

    PinterestLibPaginationOrder(String value) {
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
    public static PinterestLibPaginationOrder fromValue(String text) {
        for (PinterestLibPaginationOrder b : PinterestLibPaginationOrder.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

