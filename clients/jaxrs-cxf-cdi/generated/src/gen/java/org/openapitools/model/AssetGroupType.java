package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Asset group type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AssetGroupType {

    @JsonProperty("BRAND") BRAND(String.valueOf("BRAND")), @JsonProperty("LOCATION_OR_LANGUAGE") LOCATION_OR_LANGUAGE(String.valueOf("LOCATION_OR_LANGUAGE")), @JsonProperty("PRODUCT_LINE") PRODUCT_LINE(String.valueOf("PRODUCT_LINE")), @JsonProperty("OTHER") OTHER(String.valueOf("OTHER"));


    private String value;

    AssetGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AssetGroupType fromValue(String value) {
        for (AssetGroupType b : AssetGroupType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



