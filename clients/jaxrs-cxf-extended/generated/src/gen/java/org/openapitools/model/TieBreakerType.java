package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Quiz ad tie breaker type, default is RANDOM
 */
public enum TieBreakerType {
  
  RANDOM("RANDOM"),
  
  CUSTOM("CUSTOM");

  private String value;

  TieBreakerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TieBreakerType fromValue(String value) {
    for (TieBreakerType b : TieBreakerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

