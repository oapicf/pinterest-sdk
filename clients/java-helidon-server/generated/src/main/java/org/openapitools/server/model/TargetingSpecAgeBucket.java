package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingSpecAgeBucket
 */

public enum TargetingSpecAgeBucket {

    _18_24("18-24"),
    _19_("19+"),
    _20_("20+"),
    _21_("21+"),
    _25_34("25-34"),
    _35_44("35-44"),
    _45_49("45-49"),
    _50_54("50-54"),
    _55_64("55-64"),
    _65_("65+");

    private String value;

    TargetingSpecAgeBucket(String value) {
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
    public static TargetingSpecAgeBucket fromValue(String text) {
        for (TargetingSpecAgeBucket b : TargetingSpecAgeBucket.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

