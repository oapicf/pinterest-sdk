package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The field to search member assets by
 */

public enum AssetSearchBy {

    NAME("NAME"),
    ID("ID"),
    NAME_OR_ID("NAME_OR_ID"),
    OWNER_NAME("OWNER_NAME"),
    NAME_OR_OWNER("NAME_OR_OWNER");

    private String value;

    AssetSearchBy(String value) {
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
    public static AssetSearchBy fromValue(String text) {
        for (AssetSearchBy b : AssetSearchBy.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

