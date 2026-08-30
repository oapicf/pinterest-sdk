package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Standard Pin metric types
 */
public enum StandardPinMetricTypes {
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  PIN_CLICK("PIN_CLICK"),
  
  SAVE("SAVE"),
  
  SAVE_RATE("SAVE_RATE"),
  
  TOTAL_COMMENTS("TOTAL_COMMENTS"),
  
  TOTAL_REACTIONS("TOTAL_REACTIONS"),
  
  USER_FOLLOW("USER_FOLLOW"),
  
  PROFILE_VISIT("PROFILE_VISIT");

  private String value;

  StandardPinMetricTypes(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StandardPinMetricTypes fromValue(String value) {
    for (StandardPinMetricTypes b : StandardPinMetricTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

