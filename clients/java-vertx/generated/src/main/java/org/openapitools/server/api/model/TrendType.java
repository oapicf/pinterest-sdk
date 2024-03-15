package org.openapitools.server.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TrendType
 */
public enum TrendType {
  
  GROWING("growing"),
  
  MONTHLY("monthly"),
  
  YEARLY("yearly"),
  
  SEASONAL("seasonal");

  private String value;

  TrendType(String value) {
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

  public static TrendType fromValue(String value) {
    for (TrendType b : TrendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}