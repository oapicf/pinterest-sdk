package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Optimization type for ad group delivery estimates. Supported types vary by objective.
 */
public enum OptimizationType {
  
  CLICKTHROUGH("CLICKTHROUGH"),
  
  IMPRESSION("IMPRESSION"),
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  ROAS("ROAS"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK");

  private final String value;

  OptimizationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OptimizationType fromValue(String value) {
    for (OptimizationType b : OptimizationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

