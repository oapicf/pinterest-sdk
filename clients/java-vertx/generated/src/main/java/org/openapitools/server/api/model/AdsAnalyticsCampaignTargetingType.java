package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Reporting targeting type for campaigns
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting targeting type for campaigns
 */
public enum AdsAnalyticsCampaignTargetingType {
  
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
  
  CREATIVE_TYPE("CREATIVE_TYPE"),
  
  AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER");

  private String value;

  AdsAnalyticsCampaignTargetingType(String value) {
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

  public static AdsAnalyticsCampaignTargetingType fromValue(String value) {
    for (AdsAnalyticsCampaignTargetingType b : AdsAnalyticsCampaignTargetingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}