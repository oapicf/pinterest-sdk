package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The schedule action
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The schedule action
 */
public enum ScheduleAction {
  
  INCREASE_BY_VALUE("INCREASE_BY_VALUE"),
  
  INCREASE_BY_PERCENT("INCREASE_BY_PERCENT");

  private String value;

  ScheduleAction(String value) {
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

  public static ScheduleAction fromValue(String value) {
    for (ScheduleAction b : ScheduleAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}