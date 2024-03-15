package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrendType fromValue(String text) {
    for (TrendType b : TrendType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


