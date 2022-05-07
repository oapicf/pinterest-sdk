package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ActionType fromValue(String value) {
    for (ActionType b : ActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

