package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ScheduleAction fromValue(String text) {
    for (ScheduleAction b : ScheduleAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

