package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The schedule type
 */
public enum ScheduleType {
  
  CAMPAIGN_BUDGET_CHANGE("CAMPAIGN_BUDGET_CHANGE"),
  
  CAMPAIGN_BID_MULTIPLIERS("CAMPAIGN_BID_MULTIPLIERS");

  private String value;

  ScheduleType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ScheduleType fromValue(String value) {
    for (ScheduleType b : ScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

