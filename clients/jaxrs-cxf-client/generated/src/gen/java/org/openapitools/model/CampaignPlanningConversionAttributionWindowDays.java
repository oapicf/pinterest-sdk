package org.openapitools.model;



/**
 * Conversion attribution window in days.
 */
public enum CampaignPlanningConversionAttributionWindowDays {
  
  DAYS_0("DAYS_0"),
  
  DAYS_1("DAYS_1"),
  
  DAYS_7("DAYS_7"),
  
  DAYS_30("DAYS_30"),
  
  DAYS_60("DAYS_60");

  private String value;

  CampaignPlanningConversionAttributionWindowDays(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignPlanningConversionAttributionWindowDays fromValue(String value) {
    for (CampaignPlanningConversionAttributionWindowDays b : CampaignPlanningConversionAttributionWindowDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

