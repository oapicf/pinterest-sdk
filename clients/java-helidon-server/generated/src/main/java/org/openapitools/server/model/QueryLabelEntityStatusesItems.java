package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets QueryLabelEntityStatusesItems
 */

public enum QueryLabelEntityStatusesItems {

    ACTIVE("ACTIVE"),
    ARCHIVED("ARCHIVED");

    private String value;

    QueryLabelEntityStatusesItems(String value) {
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
    public static QueryLabelEntityStatusesItems fromValue(String text) {
        for (QueryLabelEntityStatusesItems b : QueryLabelEntityStatusesItems.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

