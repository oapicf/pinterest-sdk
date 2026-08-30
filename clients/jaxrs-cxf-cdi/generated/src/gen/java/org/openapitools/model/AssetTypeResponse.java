package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AssetTypeResponse {

    @JsonProperty("AD_ACCOUNT") AD_ACCOUNT(String.valueOf("AD_ACCOUNT")), @JsonProperty("MERCHANT") MERCHANT(String.valueOf("MERCHANT")), @JsonProperty("PROFILE") PROFILE(String.valueOf("PROFILE")), @JsonProperty("ASSET_GROUP") ASSET_GROUP(String.valueOf("ASSET_GROUP")), @JsonProperty("PINNER_LIST") PINNER_LIST(String.valueOf("PINNER_LIST")), @JsonProperty("CONVERSION_TAG") CONVERSION_TAG(String.valueOf("CONVERSION_TAG")), @JsonProperty("CATALOG") CATALOG(String.valueOf("CATALOG")), @JsonProperty("CONVERSION_SEGMENT") CONVERSION_SEGMENT(String.valueOf("CONVERSION_SEGMENT"));


    private String value;

    AssetTypeResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AssetTypeResponse fromValue(String value) {
        for (AssetTypeResponse b : AssetTypeResponse.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



