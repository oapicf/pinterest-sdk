package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FreqBidMultiplierTimeWindow fromValue(String value) {
    for (FreqBidMultiplierTimeWindow b : FreqBidMultiplierTimeWindow.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

