package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting targeting type
 */
public enum AdAdsAnalyticsAsyncTargetingTypes {
  
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
  
  MEDIA_TYPE("MEDIA_TYPE"),
  
  AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER"),
  
  AUDIENCE_MULTIPLIER("AUDIENCE_MULTIPLIER"),
  
  CREATIVE_ENHANCEMENTS("CREATIVE_ENHANCEMENTS"),
  
  LOCAL_ADS_STORE_CODE("LOCAL_ADS_STORE_CODE");

  private String value;

  AdAdsAnalyticsAsyncTargetingTypes(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdAdsAnalyticsAsyncTargetingTypes fromValue(String value) {
    for (AdAdsAnalyticsAsyncTargetingTypes b : AdAdsAnalyticsAsyncTargetingTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

