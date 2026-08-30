package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Reporting targeting type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdAdsAnalyticsAsyncTargetingTypes {

    @JsonProperty("KEYWORD") KEYWORD(String.valueOf("KEYWORD")), @JsonProperty("APPTYPE") APPTYPE(String.valueOf("APPTYPE")), @JsonProperty("GENDER") GENDER(String.valueOf("GENDER")), @JsonProperty("LOCATION") LOCATION(String.valueOf("LOCATION")), @JsonProperty("PLACEMENT") PLACEMENT(String.valueOf("PLACEMENT")), @JsonProperty("COUNTRY") COUNTRY(String.valueOf("COUNTRY")), @JsonProperty("TARGETED_INTEREST") TARGETED_INTEREST(String.valueOf("TARGETED_INTEREST")), @JsonProperty("PINNER_INTEREST") PINNER_INTEREST(String.valueOf("PINNER_INTEREST")), @JsonProperty("AUDIENCE_INCLUDE") AUDIENCE_INCLUDE(String.valueOf("AUDIENCE_INCLUDE")), @JsonProperty("GEO") GEO(String.valueOf("GEO")), @JsonProperty("AGE_BUCKET") AGE_BUCKET(String.valueOf("AGE_BUCKET")), @JsonProperty("REGION") REGION(String.valueOf("REGION")), @JsonProperty("MEDIA_TYPE") MEDIA_TYPE(String.valueOf("MEDIA_TYPE")), @JsonProperty("AGE_BUCKET_AND_GENDER") AGE_BUCKET_AND_GENDER(String.valueOf("AGE_BUCKET_AND_GENDER")), @JsonProperty("AUDIENCE_MULTIPLIER") AUDIENCE_MULTIPLIER(String.valueOf("AUDIENCE_MULTIPLIER")), @JsonProperty("CREATIVE_ENHANCEMENTS") CREATIVE_ENHANCEMENTS(String.valueOf("CREATIVE_ENHANCEMENTS")), @JsonProperty("LOCAL_ADS_STORE_CODE") LOCAL_ADS_STORE_CODE(String.valueOf("LOCAL_ADS_STORE_CODE"));


    private String value;

    AdAdsAnalyticsAsyncTargetingTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdAdsAnalyticsAsyncTargetingTypes fromValue(String value) {
        for (AdAdsAnalyticsAsyncTargetingTypes b : AdAdsAnalyticsAsyncTargetingTypes.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



