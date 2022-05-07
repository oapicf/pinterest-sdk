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
  public static AdsAnalyticsFilterOperator fromValue(String text) {
    for (AdsAnalyticsFilterOperator b : AdsAnalyticsFilterOperator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

