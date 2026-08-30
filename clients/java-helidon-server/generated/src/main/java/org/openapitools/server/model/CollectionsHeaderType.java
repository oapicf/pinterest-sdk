package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Collections ad header type
 */

public enum CollectionsHeaderType {

    SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
    EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
    NO_HEADER("NO_HEADER"),
    ON_SALE("ON_SALE"),
    GET_DEAL("GET_DEAL");

    private String value;

    CollectionsHeaderType(String value) {
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
    public static CollectionsHeaderType fromValue(String text) {
        for (CollectionsHeaderType b : CollectionsHeaderType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

