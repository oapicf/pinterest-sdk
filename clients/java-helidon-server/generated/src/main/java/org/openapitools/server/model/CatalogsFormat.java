package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The file format of a feed.
 */

public enum CatalogsFormat {

    TSV("TSV"),
    CSV("CSV"),
    XML("XML"),
    INTEGRATION("INTEGRATION");

    private String value;

    CatalogsFormat(String value) {
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
    public static CatalogsFormat fromValue(String text) {
        for (CatalogsFormat b : CatalogsFormat.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

