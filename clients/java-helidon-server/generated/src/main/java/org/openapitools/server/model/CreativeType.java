package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */

public enum CreativeType {

    REGULAR("REGULAR"),
    VIDEO("VIDEO"),
    SHOPPING("SHOPPING"),
    CAROUSEL("CAROUSEL"),
    MAX_VIDEO("MAX_VIDEO"),
    SHOP_THE_PIN("SHOP_THE_PIN"),
    COLLECTION("COLLECTION"),
    IDEA("IDEA"),
    SHOWCASE("SHOWCASE"),
    QUIZ("QUIZ"),
    COLLAGE("COLLAGE"),
    MAX_WIDTH_REGULAR_COLLECTION("MAX_WIDTH_REGULAR_COLLECTION"),
    MAX_WIDTH_VIDEO_COLLECTION("MAX_WIDTH_VIDEO_COLLECTION"),
    APP("APP");

    private String value;

    CreativeType(String value) {
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
    public static CreativeType fromValue(String text) {
        for (CreativeType b : CreativeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

