package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets GenderBucket
 */
public enum GenderBucket {
  
  MALE("MALE"),
  
  FEMALE("FEMALE"),
  
  UNSPECIFIED("UNSPECIFIED");

  private final String value;

  GenderBucket(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GenderBucket fromValue(String value) {
    for (GenderBucket b : GenderBucket.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

