package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Ad event type used for attribution.
 */
public enum AttributionScope {
  
  VIEW("view"),
  
  ENGAGEMENT("engagement"),
  
  CLICK("click");

  private final String value;

  AttributionScope(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AttributionScope fromValue(String value) {
    for (AttributionScope b : AttributionScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

