package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Attribution model used to attribute the conversion event.
 */

public enum AttributionModel {

    FIRST_TOUCH("first_touch"),
    LAST_TOUCH("last_touch"),
    MULTI_TOUCH("multi_touch"),
    MMM("mmm");

    private String value;

    AttributionModel(String value) {
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
    public static AttributionModel fromValue(String text) {
        for (AttributionModel b : AttributionModel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

