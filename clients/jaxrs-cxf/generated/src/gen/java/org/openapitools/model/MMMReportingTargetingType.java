package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ad targeting types for MMM report
 */
public enum MMMReportingTargetingType {
  
  APPTYPE("APPTYPE"),
  
  COUNTRY("COUNTRY"),
  
  CREATIVE_TYPE("CREATIVE_TYPE"),
  
  GENDER("GENDER"),
  
  LOCATION("LOCATION");

  private String value;

  MMMReportingTargetingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MMMReportingTargetingType fromValue(String value) {
    for (MMMReportingTargetingType b : MMMReportingTargetingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

