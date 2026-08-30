package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TrendsAgeBucket
 */

public enum TrendsAgeBucket {

    _18_24("18-24"),
    _25_34("25-34"),
    _35_44("35-44"),
    _45_49("45-49"),
    _50_54("50-54"),
    _55_64("55-64"),
    _65_("65+");

    private String value;

    TrendsAgeBucket(String value) {
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
    public static TrendsAgeBucket fromValue(String text) {
        for (TrendsAgeBucket b : TrendsAgeBucket.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

