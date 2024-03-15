package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Filter operator for sync reporting
 */
public enum AdsAnalyticsFilterOperator {
  
  LESS_THAN("LESS_THAN"),
  
  GREATER_THAN("GREATER_THAN");

  private String value;

  AdsAnalyticsFilterOperator(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdsAnalyticsFilterOperator fromValue(String value) {
    for (AdsAnalyticsFilterOperator b : AdsAnalyticsFilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

