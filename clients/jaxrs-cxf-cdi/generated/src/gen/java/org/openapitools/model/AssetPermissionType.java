package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Permission aggregation type for asset access
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AssetPermissionType {

    @JsonProperty("AGGREGATED_PERMISSION") AGGREGATED_PERMISSION(String.valueOf("AGGREGATED_PERMISSION")), @JsonProperty("DIRECT_PERMISSION") DIRECT_PERMISSION(String.valueOf("DIRECT_PERMISSION"));


    private String value;

    AssetPermissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AssetPermissionType fromValue(String value) {
        for (AssetPermissionType b : AssetPermissionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



