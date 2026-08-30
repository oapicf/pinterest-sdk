package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OptimizationType fromValue(String text) {
    for (OptimizationType b : OptimizationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

