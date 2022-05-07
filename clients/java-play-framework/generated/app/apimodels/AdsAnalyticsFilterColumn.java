package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Reporting columns for sync reporting data filter
 */
public enum AdsAnalyticsFilterColumn {
  
  SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
  
  TOTAL_IMPRESSION("TOTAL_IMPRESSION");

  private final String value;

  AdsAnalyticsFilterColumn(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdsAnalyticsFilterColumn fromValue(String value) {
    for (AdsAnalyticsFilterColumn b : AdsAnalyticsFilterColumn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

