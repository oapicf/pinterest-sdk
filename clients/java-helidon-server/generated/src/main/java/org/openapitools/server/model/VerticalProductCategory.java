package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of verticals for product categories.
 */

public enum VerticalProductCategory {

    FASHION("FASHION"),
    HOME_DECOR("HOME_DECOR"),
    BEAUTY("BEAUTY");

    private String value;

    VerticalProductCategory(String value) {
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
    public static VerticalProductCategory fromValue(String text) {
        for (VerticalProductCategory b : VerticalProductCategory.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

