package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Order Line Status
 */
public enum OrderLineStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  DELETED("DELETED");

  private final String value;

  OrderLineStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderLineStatus fromValue(String value) {
    for (OrderLineStatus b : OrderLineStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

