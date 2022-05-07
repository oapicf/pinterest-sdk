package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 */
public enum ConversionReportAttributionType {
  
  INDIVIDUAL("INDIVIDUAL"),
  
  HOUSEHOLD("HOUSEHOLD");

  private String value;

  ConversionReportAttributionType(String value) {
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

  public static ConversionReportAttributionType fromValue(String value) {
    for (ConversionReportAttributionType b : ConversionReportAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}