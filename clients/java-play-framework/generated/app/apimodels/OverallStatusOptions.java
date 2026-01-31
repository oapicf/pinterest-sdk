package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Overall status of event quality score.
 */
public enum OverallStatusOptions {
  
  NEEDS_IMPROVEMENT("NEEDS_IMPROVEMENT"),
  
  FAIR("FAIR"),
  
  GOOD("GOOD");

  private final String value;

  OverallStatusOptions(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OverallStatusOptions fromValue(String value) {
    for (OverallStatusOptions b : OverallStatusOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

