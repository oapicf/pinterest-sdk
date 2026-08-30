package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting targeting type
 */

public enum AdsAnalyticsAccountTargetingType {

    KEYWORD("KEYWORD"),
    APPTYPE("APPTYPE"),
    GENDER("GENDER"),
    LOCATION("LOCATION"),
    PLACEMENT("PLACEMENT"),
    COUNTRY("COUNTRY"),
    TARGETED_INTEREST("TARGETED_INTEREST"),
    PINNER_INTEREST("PINNER_INTEREST"),
    AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
    GEO("GEO"),
    AGE_BUCKET("AGE_BUCKET"),
    REGION("REGION"),
    AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER");

    private String value;

    AdsAnalyticsAccountTargetingType(String value) {
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
    public static AdsAnalyticsAccountTargetingType fromValue(String text) {
        for (AdsAnalyticsAccountTargetingType b : AdsAnalyticsAccountTargetingType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

