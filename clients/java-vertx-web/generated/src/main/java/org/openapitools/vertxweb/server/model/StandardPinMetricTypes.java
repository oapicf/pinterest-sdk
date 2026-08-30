package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Standard Pin metric types
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StandardPinMetricTypes fromValue(String value) {
    for (StandardPinMetricTypes b : StandardPinMetricTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}