package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static ScheduleStatus fromValue(String text) {
    for (ScheduleStatus b : ScheduleStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

