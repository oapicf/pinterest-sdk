package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
  public static PinFilter fromValue(String value) {
    for (PinFilter b : PinFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

