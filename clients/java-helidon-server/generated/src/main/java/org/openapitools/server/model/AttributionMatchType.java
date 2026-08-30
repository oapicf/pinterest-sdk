package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */

public enum AttributionMatchType {

    P("P"),
    D("D"),
    NA("NA");

    private String value;

    AttributionMatchType(String value) {
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
    public static AttributionMatchType fromValue(String text) {
        for (AttributionMatchType b : AttributionMatchType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

