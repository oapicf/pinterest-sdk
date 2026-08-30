package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The time window for frequency bid multipliers.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The time window for frequency bid multipliers.
 */
public enum FreqBidMultiplierTimeWindow {
  
  WEEK("WEEK"),
  
  MONTH("MONTH");

  private String value;

  FreqBidMultiplierTimeWindow(String value) {
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

  public static FreqBidMultiplierTimeWindow fromValue(String value) {
    for (FreqBidMultiplierTimeWindow b : FreqBidMultiplierTimeWindow.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}