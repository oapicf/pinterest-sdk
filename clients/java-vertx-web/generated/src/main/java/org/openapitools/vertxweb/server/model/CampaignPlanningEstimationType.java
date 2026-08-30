package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Estimation type for campaign planning estimated curve
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignPlanningEstimationType fromValue(String value) {
    for (CampaignPlanningEstimationType b : CampaignPlanningEstimationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}