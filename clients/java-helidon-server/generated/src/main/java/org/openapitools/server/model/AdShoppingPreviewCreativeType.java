package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdShoppingPreviewCreativeType
 */

public enum AdShoppingPreviewCreativeType {

    SHOPPING("SHOPPING"),
    COLLECTION("COLLECTION"),
    CAROUSEL("CAROUSEL"),
    MAX_WIDTH_COLLECTION("MAX_WIDTH_COLLECTION");

    private String value;

    AdShoppingPreviewCreativeType(String value) {
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
    public static AdShoppingPreviewCreativeType fromValue(String text) {
        for (AdShoppingPreviewCreativeType b : AdShoppingPreviewCreativeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

