package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PinFilter
 */
public enum PinFilter {
  
  EXCLUDE_NATIVE("exclude_native"),
  
  EXCLUDE_REPINS("exclude_repins"),
  
  HAS_BEEN_PROMOTED("has_been_promoted");

  private final String value;

  PinFilter(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PinFilter fromValue(String value) {
    for (PinFilter b : PinFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

