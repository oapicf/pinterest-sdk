package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdGroupAudienceSizingCreativeTypes
 */
public enum AdGroupAudienceSizingCreativeTypes {
  
  REGULAR("REGULAR"),
  
  VIDEO("VIDEO"),
  
  SHOPPING("SHOPPING"),
  
  CAROUSEL("CAROUSEL"),
  
  MAX_VIDEO("MAX_VIDEO"),
  
  SHOP_THE_PIN("SHOP_THE_PIN"),
  
  COLLECTION("COLLECTION"),
  
  IDEA("IDEA");

  private String value;

  AdGroupAudienceSizingCreativeTypes(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdGroupAudienceSizingCreativeTypes fromValue(String value) {
    for (AdGroupAudienceSizingCreativeTypes b : AdGroupAudienceSizingCreativeTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

