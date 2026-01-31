package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Reporting targeting type for ad groups
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting targeting type for ad groups
 */
public enum AdsAnalyticsAdGroupTargetingType {
  
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
  
  AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER"),
  
  CREATIVE_ENHANCEMENTS("CREATIVE_ENHANCEMENTS");

  private String value;

  AdsAnalyticsAdGroupTargetingType(String value) {
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

  public static AdsAnalyticsAdGroupTargetingType fromValue(String value) {
    for (AdsAnalyticsAdGroupTargetingType b : AdsAnalyticsAdGroupTargetingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}