package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Collections ad header type for ads
 */

public enum AdCollectionsHeaderType {

    SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
    EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
    NO_HEADER("NO_HEADER");

    private String value;

    AdCollectionsHeaderType(String value) {
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
    public static AdCollectionsHeaderType fromValue(String text) {
        for (AdCollectionsHeaderType b : AdCollectionsHeaderType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

