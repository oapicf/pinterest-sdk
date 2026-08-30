package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Conversion event for which a conversion rate estimate is computed.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static CampaignPlanningConversionEvent fromValue(String text) {
    for (CampaignPlanningConversionEvent b : CampaignPlanningConversionEvent.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


