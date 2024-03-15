package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Refers ads entity type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BulkEntityType {

    @JsonProperty("CAMPAIGN") CAMPAIGN(String.valueOf("CAMPAIGN")), @JsonProperty("AD_GROUP") AD_GROUP(String.valueOf("AD_GROUP")), @JsonProperty("PRODUCT_GROUP") PRODUCT_GROUP(String.valueOf("PRODUCT_GROUP")), @JsonProperty("AD") AD(String.valueOf("AD")), @JsonProperty("KEYWORD") KEYWORD(String.valueOf("KEYWORD"));


    private String value;

    BulkEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BulkEntityType fromValue(String value) {
        for (BulkEntityType b : BulkEntityType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



