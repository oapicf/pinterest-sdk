package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Permission aggregation type for asset access
 */

public enum AssetPermissionType {

    AGGREGATED_PERMISSION("AGGREGATED_PERMISSION"),
    DIRECT_PERMISSION("DIRECT_PERMISSION");

    private String value;

    AssetPermissionType(String value) {
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
    public static AssetPermissionType fromValue(String text) {
        for (AssetPermissionType b : AssetPermissionType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

