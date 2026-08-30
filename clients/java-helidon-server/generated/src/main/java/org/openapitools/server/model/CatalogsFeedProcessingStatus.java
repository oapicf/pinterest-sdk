package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CatalogsFeedProcessingStatus
 */

public enum CatalogsFeedProcessingStatus {

    COMPLETED("COMPLETED"),
    FAILED("FAILED"),
    PROCESSING("PROCESSING");

    private String value;

    CatalogsFeedProcessingStatus(String value) {
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
    public static CatalogsFeedProcessingStatus fromValue(String text) {
        for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

