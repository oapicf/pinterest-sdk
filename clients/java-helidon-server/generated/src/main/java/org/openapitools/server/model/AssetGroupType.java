package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Asset group type.
 */

public enum AssetGroupType {

    BRAND("BRAND"),
    LOCATION_OR_LANGUAGE("LOCATION_OR_LANGUAGE"),
    PRODUCT_LINE("PRODUCT_LINE"),
    OTHER("OTHER");

    private String value;

    AssetGroupType(String value) {
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
    public static AssetGroupType fromValue(String text) {
        for (AssetGroupType b : AssetGroupType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

