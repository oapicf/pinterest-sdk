package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TargetingSpecListOperation
 */
public enum TargetingSpecListOperation {
  
  SET("SET"),
  
  ADD("ADD"),
  
  REMOVE("REMOVE");

  private final String value;

  TargetingSpecListOperation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingSpecListOperation fromValue(String value) {
    for (TargetingSpecListOperation b : TargetingSpecListOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

