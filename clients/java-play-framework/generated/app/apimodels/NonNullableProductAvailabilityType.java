package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Product availability.
 */
public enum NonNullableProductAvailabilityType {
  
  IN_STOCK("IN_STOCK"),
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  PREORDER("PREORDER");

  private final String value;

  NonNullableProductAvailabilityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NonNullableProductAvailabilityType fromValue(String value) {
    for (NonNullableProductAvailabilityType b : NonNullableProductAvailabilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

