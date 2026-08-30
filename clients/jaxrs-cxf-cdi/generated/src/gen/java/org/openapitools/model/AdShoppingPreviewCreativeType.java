package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdShoppingPreviewCreativeType {

    @JsonProperty("SHOPPING") SHOPPING(String.valueOf("SHOPPING")), @JsonProperty("COLLECTION") COLLECTION(String.valueOf("COLLECTION")), @JsonProperty("CAROUSEL") CAROUSEL(String.valueOf("CAROUSEL")), @JsonProperty("MAX_WIDTH_COLLECTION") MAX_WIDTH_COLLECTION(String.valueOf("MAX_WIDTH_COLLECTION"));


    private String value;

    AdShoppingPreviewCreativeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdShoppingPreviewCreativeType fromValue(String value) {
        for (AdShoppingPreviewCreativeType b : AdShoppingPreviewCreativeType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



