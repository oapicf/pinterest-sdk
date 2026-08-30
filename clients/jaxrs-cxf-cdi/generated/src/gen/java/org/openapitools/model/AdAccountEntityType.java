package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Specify the entity type to get summary information
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdAccountEntityType {

    @JsonProperty("ADVERTISER") ADVERTISER(String.valueOf("ADVERTISER")), @JsonProperty("CAMPAIGN") CAMPAIGN(String.valueOf("CAMPAIGN")), @JsonProperty("AD_GROUP") AD_GROUP(String.valueOf("AD_GROUP")), @JsonProperty("AD") AD(String.valueOf("AD"));


    private String value;

    AdAccountEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdAccountEntityType fromValue(String value) {
        for (AdAccountEntityType b : AdAccountEntityType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



