package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Reporting targeting type
 **/

public enum AdsAnalyticsTargetingType {

    KEYWORD(String.valueOf("KEYWORD")), APPTYPE(String.valueOf("APPTYPE")), GENDER(String.valueOf("GENDER")), LOCATION(String.valueOf("LOCATION")), PLACEMENT(String.valueOf("PLACEMENT")), COUNTRY(String.valueOf("COUNTRY")), TARGETED_INTEREST(String.valueOf("TARGETED_INTEREST")), PINNER_INTEREST(String.valueOf("PINNER_INTEREST")), AUDIENCE_INCLUDE(String.valueOf("AUDIENCE_INCLUDE")), AUDIENCE_EXCLUDE(String.valueOf("AUDIENCE_EXCLUDE")), GEO(String.valueOf("GEO")), AGE_BUCKET(String.valueOf("AGE_BUCKET")), REGION(String.valueOf("REGION"));


    private String value;

    AdsAnalyticsTargetingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdsAnalyticsTargetingType fromValue(String value) {
        for (AdsAnalyticsTargetingType b : AdsAnalyticsTargetingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



