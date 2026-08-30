package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FreqBidMultiplierTimeWindow fromValue(String text) {
    for (FreqBidMultiplierTimeWindow b : FreqBidMultiplierTimeWindow.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

