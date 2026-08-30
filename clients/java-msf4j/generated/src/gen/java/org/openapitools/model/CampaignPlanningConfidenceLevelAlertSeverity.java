package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Severity of a confidence level alert on delivery estimates.
 */
public enum CampaignPlanningConfidenceLevelAlertSeverity {
  
  UNKNOWN("UNKNOWN"),
  
  LOW_MILD("LOW_MILD"),
  
  LOW_MODERATE("LOW_MODERATE"),
  
  LOW_SEVERE("LOW_SEVERE");

  private String value;

  CampaignPlanningConfidenceLevelAlertSeverity(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignPlanningConfidenceLevelAlertSeverity fromValue(String text) {
    for (CampaignPlanningConfidenceLevelAlertSeverity b : CampaignPlanningConfidenceLevelAlertSeverity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

