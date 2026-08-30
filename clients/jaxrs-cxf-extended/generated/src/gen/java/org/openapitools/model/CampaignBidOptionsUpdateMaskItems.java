package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignBidOptionsUpdateMaskItems fromValue(String value) {
    for (CampaignBidOptionsUpdateMaskItems b : CampaignBidOptionsUpdateMaskItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

