package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignPlanningConversionAttributionWindowDays fromValue(String value) {
    for (CampaignPlanningConversionAttributionWindowDays b : CampaignPlanningConversionAttributionWindowDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

