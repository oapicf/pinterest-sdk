package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PinFilter
 */
public enum PinFilter {
  
  EXCLUDE_NATIVE("exclude_native"),
  
  EXCLUDE_REPINS("exclude_repins"),
  
  HAS_BEEN_PROMOTED("has_been_promoted");

  private String value;

  PinFilter(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PinFilter fromValue(String text) {
    for (PinFilter b : PinFilter.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


