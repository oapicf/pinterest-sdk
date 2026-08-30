package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static CampaignPlanningConversionAttributionWindowDays fromValue(String text) {
    for (CampaignPlanningConversionAttributionWindowDays b : CampaignPlanningConversionAttributionWindowDays.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

