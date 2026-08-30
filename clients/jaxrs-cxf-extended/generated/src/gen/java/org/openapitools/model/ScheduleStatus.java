package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Schedule status
 */
public enum ScheduleStatus {
  
  DRAFT("DRAFT"),
  
  CREATED("CREATED"),
  
  SCHEDULED("SCHEDULED"),
  
  ACTIVE("ACTIVE"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED"),
  
  CANCELED("CANCELED");

  private String value;

  ScheduleStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ScheduleStatus fromValue(String value) {
    for (ScheduleStatus b : ScheduleStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

