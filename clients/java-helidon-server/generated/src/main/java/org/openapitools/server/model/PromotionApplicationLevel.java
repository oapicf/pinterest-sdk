package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specify if the promotion is applied at ad group or item level.
 */

public enum PromotionApplicationLevel {

    NONE("NONE"),
    ITEM("ITEM"),
    AD_GROUP("AD_GROUP");

    private String value;

    PromotionApplicationLevel(String value) {
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
    public static PromotionApplicationLevel fromValue(String text) {
        for (PromotionApplicationLevel b : PromotionApplicationLevel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

