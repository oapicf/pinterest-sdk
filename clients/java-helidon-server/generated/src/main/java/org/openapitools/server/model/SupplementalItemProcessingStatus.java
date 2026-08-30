package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the item processing record
 */

public enum SupplementalItemProcessingStatus {

    SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    PROCESSING("PROCESSING");

    private String value;

    SupplementalItemProcessingStatus(String value) {
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
    public static SupplementalItemProcessingStatus fromValue(String text) {
        for (SupplementalItemProcessingStatus b : SupplementalItemProcessingStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

