package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Level of the report
 */
public enum ConversionProductReportLevel {
  
  ADVERTISER("ADVERTISER"),
  
  CAMPAIGN("CAMPAIGN"),
  
  AD_GROUP("AD_GROUP");

  private String value;

  ConversionProductReportLevel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionProductReportLevel fromValue(String value) {
    for (ConversionProductReportLevel b : ConversionProductReportLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

