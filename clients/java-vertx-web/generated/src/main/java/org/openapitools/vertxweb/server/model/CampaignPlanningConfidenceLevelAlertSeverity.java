package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Severity of a confidence level alert on delivery estimates.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignPlanningConfidenceLevelAlertSeverity fromValue(String value) {
    for (CampaignPlanningConfidenceLevelAlertSeverity b : CampaignPlanningConfidenceLevelAlertSeverity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}