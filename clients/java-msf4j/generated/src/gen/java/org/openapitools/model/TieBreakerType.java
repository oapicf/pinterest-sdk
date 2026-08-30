package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static TieBreakerType fromValue(String text) {
    for (TieBreakerType b : TieBreakerType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

