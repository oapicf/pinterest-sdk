package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Type of an attributed action.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of an attributed action.
 */
public enum AttributionActionType {
  
  VIEW("view"),
  
  CLICK("click");

  private String value;

  AttributionActionType(String value) {
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

  public static AttributionActionType fromValue(String value) {
    for (AttributionActionType b : AttributionActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}