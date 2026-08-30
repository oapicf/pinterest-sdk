package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Optimization type for ad group delivery estimates. Supported types vary by objective.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Optimization type for ad group delivery estimates. Supported types vary by objective.
 */
public enum OptimizationType {
  
  CLICKTHROUGH("CLICKTHROUGH"),
  
  IMPRESSION("IMPRESSION"),
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  ROAS("ROAS"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK");

  private String value;

  OptimizationType(String value) {
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

  public static OptimizationType fromValue(String value) {
    for (OptimizationType b : OptimizationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}