package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static FreqBidMultiplierTimeWindow fromValue(String value) {
    for (FreqBidMultiplierTimeWindow b : FreqBidMultiplierTimeWindow.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

