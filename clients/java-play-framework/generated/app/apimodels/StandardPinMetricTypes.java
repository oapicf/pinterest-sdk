package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Standard Pin metric types
 */
public enum StandardPinMetricTypes {
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  PIN_CLICK("PIN_CLICK"),
  
  SAVE("SAVE"),
  
  SAVE_RATE("SAVE_RATE"),
  
  TOTAL_COMMENTS("TOTAL_COMMENTS"),
  
  TOTAL_REACTIONS("TOTAL_REACTIONS"),
  
  USER_FOLLOW("USER_FOLLOW"),
  
  PROFILE_VISIT("PROFILE_VISIT");

  private final String value;

  StandardPinMetricTypes(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StandardPinMetricTypes fromValue(String value) {
    for (StandardPinMetricTypes b : StandardPinMetricTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

