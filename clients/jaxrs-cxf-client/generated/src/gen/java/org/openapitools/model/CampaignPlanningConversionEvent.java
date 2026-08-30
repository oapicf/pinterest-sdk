package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignPlanningConversionEvent fromValue(String value) {
    for (CampaignPlanningConversionEvent b : CampaignPlanningConversionEvent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

