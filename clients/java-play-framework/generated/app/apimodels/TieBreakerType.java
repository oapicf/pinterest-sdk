package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Quiz ad tie breaker type, default is RANDOM
 */
public enum TieBreakerType {
  
  RANDOM("RANDOM"),
  
  CUSTOM("CUSTOM");

  private final String value;

  TieBreakerType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TieBreakerType fromValue(String value) {
    for (TieBreakerType b : TieBreakerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

