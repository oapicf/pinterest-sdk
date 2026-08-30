package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Availability of the item
 */
public enum ItemAvailability {
  
  IN_STOCK("in stock"),
  
  OUT_OF_STOCK("out of stock"),
  
  PREORDER("preorder");

  private final String value;

  ItemAvailability(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ItemAvailability fromValue(String value) {
    for (ItemAvailability b : ItemAvailability.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

