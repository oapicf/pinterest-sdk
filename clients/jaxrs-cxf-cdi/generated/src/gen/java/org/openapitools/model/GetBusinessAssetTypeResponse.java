package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Type of asset.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum GetBusinessAssetTypeResponse {

    @JsonProperty("AD_ACCOUNT") AD_ACCOUNT(String.valueOf("AD_ACCOUNT")), @JsonProperty("PROFILE") PROFILE(String.valueOf("PROFILE")), @JsonProperty("ASSET_GROUP") ASSET_GROUP(String.valueOf("ASSET_GROUP")), @JsonProperty("CONVERSION_TAG") CONVERSION_TAG(String.valueOf("CONVERSION_TAG"));


    private String value;

    GetBusinessAssetTypeResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GetBusinessAssetTypeResponse fromValue(String value) {
        for (GetBusinessAssetTypeResponse b : GetBusinessAssetTypeResponse.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



