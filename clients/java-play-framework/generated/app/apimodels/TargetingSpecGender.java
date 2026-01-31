package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TargetingSpecGender
 */
public enum TargetingSpecGender {
  
  UNKNOWN("unknown"),
  
  MALE("male"),
  
  FEMALE("female");

  private final String value;

  TargetingSpecGender(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingSpecGender fromValue(String value) {
    for (TargetingSpecGender b : TargetingSpecGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

