package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Conversion event for which a conversion rate estimate is computed.
 */
public enum CampaignPlanningConversionEvent {
  
  SIGNUP("SIGNUP"),
  
  CHECKOUT("CHECKOUT"),
  
  ADD_TO_CART("ADD_TO_CART"),
  
  LEAD("LEAD");

  private String value;

  CampaignPlanningConversionEvent(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignPlanningConversionEvent fromValue(String value) {
    for (CampaignPlanningConversionEvent b : CampaignPlanningConversionEvent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

