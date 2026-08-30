package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Quiz ad tie breaker type, default is RANDOM
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TieBreakerType fromValue(String value) {
    for (TieBreakerType b : TieBreakerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}