package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Level of the report
 */

public enum ConversionProductReportLevel {

    ADVERTISER("ADVERTISER"),
    CAMPAIGN("CAMPAIGN"),
    AD_GROUP("AD_GROUP");

    private String value;

    ConversionProductReportLevel(String value) {
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
    public static ConversionProductReportLevel fromValue(String text) {
        for (ConversionProductReportLevel b : ConversionProductReportLevel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

