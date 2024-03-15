package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Order Line Paid Type
 */
public enum OrderLinePaidType {
  
  PAID("PAID"),
  
  BONUS("BONUS"),
  
  MAKE_GOOD("MAKE_GOOD"),
  
  TEST("TEST"),
  
  NULL("null");

  private final String value;

  OrderLinePaidType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderLinePaidType fromValue(String value) {
    for (OrderLinePaidType b : OrderLinePaidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

