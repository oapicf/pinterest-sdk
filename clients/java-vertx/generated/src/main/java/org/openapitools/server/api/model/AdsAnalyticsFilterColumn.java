package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Reporting columns for sync reporting data filter
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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