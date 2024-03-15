package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Filter operator for sync reporting
 */
public enum AdsAnalyticsFilterOperator {
  
  LESS_THAN("LESS_THAN"),
  
  GREATER_THAN("GREATER_THAN");

  private final String value;

  AdsAnalyticsFilterOperator(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdsAnalyticsFilterOperator fromValue(String value) {
    for (AdsAnalyticsFilterOperator b : AdsAnalyticsFilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

