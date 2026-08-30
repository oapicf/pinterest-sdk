package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Schedule status
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScheduleStatus fromValue(String value) {
    for (ScheduleStatus b : ScheduleStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}