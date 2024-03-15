package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Reporting targeting type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting targeting type
 */
public enum AdsAnalyticsTargetingType {
  
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
  
  REGION("REGION");

  private String value;

  AdsAnalyticsTargetingType(String value) {
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

  public static AdsAnalyticsTargetingType fromValue(String value) {
    for (AdsAnalyticsTargetingType b : AdsAnalyticsTargetingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}