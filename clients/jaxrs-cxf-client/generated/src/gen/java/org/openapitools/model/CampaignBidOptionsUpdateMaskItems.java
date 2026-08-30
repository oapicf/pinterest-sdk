package org.openapitools.model;



/**
 * Fields that can be updated in campaign bid options.
 */
public enum CampaignBidOptionsUpdateMaskItems {
  
  AUDIENCE("AUDIENCE"),
  
  APP_TYPE("APP_TYPE"),
  
  PLACEMENT("PLACEMENT"),
  
  GENDER("GENDER"),
  
  AGE_BUCKET("AGE_BUCKET"),
  
  FREQUENCY("FREQUENCY");

  private String value;

  CampaignBidOptionsUpdateMaskItems(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignBidOptionsUpdateMaskItems fromValue(String value) {
    for (CampaignBidOptionsUpdateMaskItems b : CampaignBidOptionsUpdateMaskItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

