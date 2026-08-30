package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The field to search member assets by
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AssetSearchBy {

    @JsonProperty("NAME") NAME(String.valueOf("NAME")), @JsonProperty("ID") ID(String.valueOf("ID")), @JsonProperty("NAME_OR_ID") NAME_OR_ID(String.valueOf("NAME_OR_ID")), @JsonProperty("OWNER_NAME") OWNER_NAME(String.valueOf("OWNER_NAME")), @JsonProperty("NAME_OR_OWNER") NAME_OR_OWNER(String.valueOf("NAME_OR_OWNER"));


    private String value;

    AssetSearchBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AssetSearchBy fromValue(String value) {
        for (AssetSearchBy b : AssetSearchBy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



