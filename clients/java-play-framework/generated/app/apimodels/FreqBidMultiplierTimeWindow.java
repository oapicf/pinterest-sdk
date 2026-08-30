package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The time window for frequency bid multipliers.
 */
public enum FreqBidMultiplierTimeWindow {
  
  WEEK("WEEK"),
  
  MONTH("MONTH");

  private final String value;

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

