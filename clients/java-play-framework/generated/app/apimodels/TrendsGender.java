package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gender category for trends demographic distribution.
 */
public enum TrendsGender {
  
  MALE("male"),
  
  FEMALE("female"),
  
  UNSPECIFIED("unspecified");

  private final String value;

  TrendsGender(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrendsGender fromValue(String value) {
    for (TrendsGender b : TrendsGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

