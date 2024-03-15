package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Reporting columns for sync reporting data filter
 */
public enum AdsAnalyticsFilterColumn {
  
  SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
  
  TOTAL_IMPRESSION("TOTAL_IMPRESSION");

  private String value;

  AdsAnalyticsFilterColumn(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdsAnalyticsFilterColumn fromValue(String value) {
    for (AdsAnalyticsFilterColumn b : AdsAnalyticsFilterColumn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

