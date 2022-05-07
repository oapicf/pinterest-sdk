package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static AdsAnalyticsFilterOperator fromValue(String value) {
    for (AdsAnalyticsFilterOperator b : AdsAnalyticsFilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

