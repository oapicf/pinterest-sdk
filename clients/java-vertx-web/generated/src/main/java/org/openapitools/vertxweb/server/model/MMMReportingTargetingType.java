package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Ad targeting types for MMM report
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MMMReportingTargetingType fromValue(String value) {
    for (MMMReportingTargetingType b : MMMReportingTargetingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}