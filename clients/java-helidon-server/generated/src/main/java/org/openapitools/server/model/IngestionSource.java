package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets IngestionSource
 */

public enum IngestionSource {

    TAG("TAG"),
    MMP("MMP"),
    FILE_UPLOAD("FILE_UPLOAD"),
    CONVERSIONS_API("CONVERSIONS_API"),
    NATIVE("NATIVE");

    private String value;

    IngestionSource(String value) {
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
    public static IngestionSource fromValue(String text) {
        for (IngestionSource b : IngestionSource.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

