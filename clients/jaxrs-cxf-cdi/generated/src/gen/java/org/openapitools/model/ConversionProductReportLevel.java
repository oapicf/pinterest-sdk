package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Level of the report
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionProductReportLevel {

    @JsonProperty("ADVERTISER") ADVERTISER(String.valueOf("ADVERTISER")), @JsonProperty("CAMPAIGN") CAMPAIGN(String.valueOf("CAMPAIGN")), @JsonProperty("AD_GROUP") AD_GROUP(String.valueOf("AD_GROUP"));


    private String value;

    ConversionProductReportLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionProductReportLevel fromValue(String value) {
        for (ConversionProductReportLevel b : ConversionProductReportLevel.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



