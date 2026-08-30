package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdGroupAudienceSizingCreativeTypes
 */

public enum AdGroupAudienceSizingCreativeTypes {

    REGULAR("REGULAR"),
    VIDEO("VIDEO"),
    SHOPPING("SHOPPING"),
    CAROUSEL("CAROUSEL"),
    MAX_VIDEO("MAX_VIDEO"),
    SHOP_THE_PIN("SHOP_THE_PIN"),
    COLLECTION("COLLECTION"),
    IDEA("IDEA");

    private String value;

    AdGroupAudienceSizingCreativeTypes(String value) {
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
    public static AdGroupAudienceSizingCreativeTypes fromValue(String text) {
        for (AdGroupAudienceSizingCreativeTypes b : AdGroupAudienceSizingCreativeTypes.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

