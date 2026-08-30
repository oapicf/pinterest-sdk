package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
 */

public enum NullableLabelStatus {

    ACTIVE("ACTIVE"),
    ARCHIVED("ARCHIVED");

    private String value;

    NullableLabelStatus(String value) {
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
    public static NullableLabelStatus fromValue(String text) {
        for (NullableLabelStatus b : NullableLabelStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

