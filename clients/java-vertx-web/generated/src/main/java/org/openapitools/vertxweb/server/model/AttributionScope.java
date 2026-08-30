package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Ad event type used for attribution.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ad event type used for attribution.
 */
public enum AttributionScope {
  
  VIEW("view"),
  
  ENGAGEMENT("engagement"),
  
  CLICK("click");

  private String value;

  AttributionScope(String value) {
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

  public static AttributionScope fromValue(String value) {
    for (AttributionScope b : AttributionScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}