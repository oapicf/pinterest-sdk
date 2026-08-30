package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Estimation type for campaign planning estimated curve
 */
public enum CampaignPlanningEstimationType {
  
  IMPRESSION("IMPRESSION"),
  
  CLICK("CLICK"),
  
  CONVERSION("CONVERSION"),
  
  WEEKLY_FREQUENCY("WEEKLY_FREQUENCY"),
  
  WEEKLY_REACH("WEEKLY_REACH"),
  
  LIFETIME_FREQUENCY("LIFETIME_FREQUENCY"),
  
  LIFETIME_REACH("LIFETIME_REACH"),
  
  CPM("CPM"),
  
  CPC("CPC"),
  
  CPA("CPA");

  private String value;

  CampaignPlanningEstimationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignPlanningEstimationType fromValue(String text) {
    for (CampaignPlanningEstimationType b : CampaignPlanningEstimationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

