package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The field to sort member assets by
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AssetSortBy {

    @JsonProperty("NAME") NAME(String.valueOf("NAME")), @JsonProperty("ID") ID(String.valueOf("ID")), @JsonProperty("PERMISSIONS") PERMISSIONS(String.valueOf("PERMISSIONS"));


    private String value;

    AssetSortBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AssetSortBy fromValue(String value) {
        for (AssetSortBy b : AssetSortBy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



