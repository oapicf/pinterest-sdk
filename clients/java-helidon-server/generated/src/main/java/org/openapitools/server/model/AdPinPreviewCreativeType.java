package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdPinPreviewCreativeType
 */

public enum AdPinPreviewCreativeType {

    SHOPPING("SHOPPING"),
    COLLECTION("COLLECTION"),
    MAX_VIDEO("MAX_VIDEO"),
    MAX_WIDTH_VIDEO_COLLECTION("MAX_WIDTH_VIDEO_COLLECTION"),
    MAX_WIDTH_REGULAR_COLLECTION("MAX_WIDTH_REGULAR_COLLECTION");

    private String value;

    AdPinPreviewCreativeType(String value) {
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
    public static AdPinPreviewCreativeType fromValue(String text) {
        for (AdPinPreviewCreativeType b : AdPinPreviewCreativeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

