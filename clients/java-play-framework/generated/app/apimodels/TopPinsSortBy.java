package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Sort metric for top pins analytics.
 */
public enum TopPinsSortBy {
  
  ENGAGEMENT("ENGAGEMENT"),
  
  SAVE("SAVE"),
  
  IMPRESSION("IMPRESSION"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  PIN_CLICK("PIN_CLICK");

  private final String value;

  TopPinsSortBy(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TopPinsSortBy fromValue(String value) {
    for (TopPinsSortBy b : TopPinsSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

