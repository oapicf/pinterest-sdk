package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Ad group billable event type.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ad group billable event type.
 */
public enum ActionType {
  
  CLICKTHROUGH("CLICKTHROUGH"),
  
  IMPRESSION("IMPRESSION"),
  
  VIDEO_V_50_MRC("VIDEO_V_50_MRC"),
  
  BILLABLE_ENGAGEMENT("BILLABLE_ENGAGEMENT");

  private String value;

  ActionType(String value) {
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

  public static ActionType fromValue(String value) {
    for (ActionType b : ActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}