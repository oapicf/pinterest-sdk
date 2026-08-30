package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason for a confidence level alert on delivery estimates.
 */
public enum CampaignPlanningConfidenceLevelAlertReason {
  
  UNKNOWN("UNKNOWN"),
  
  OTHER("OTHER"),
  
  ADVERTISER_HAS_NO_RECENT_CAMPAIGNS("ADVERTISER_HAS_NO_RECENT_CAMPAIGNS"),
  
  ADVERTISER_HAS_NO_RECENT_CONVERSIONS("ADVERTISER_HAS_NO_RECENT_CONVERSIONS");

  private String value;

  CampaignPlanningConfidenceLevelAlertReason(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignPlanningConfidenceLevelAlertReason fromValue(String value) {
    for (CampaignPlanningConfidenceLevelAlertReason b : CampaignPlanningConfidenceLevelAlertReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

