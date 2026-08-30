package org.openapitools.model;



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

