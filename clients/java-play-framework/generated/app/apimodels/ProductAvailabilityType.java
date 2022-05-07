package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Default availability for products in a feed.
 */
public enum ProductAvailabilityType {
  
  IN_STOCK("IN_STOCK"),
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  PREORDER("PREORDER"),
  
  NULL("null");

  private final String value;

  ProductAvailabilityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductAvailabilityType fromValue(String value) {
    for (ProductAvailabilityType b : ProductAvailabilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

