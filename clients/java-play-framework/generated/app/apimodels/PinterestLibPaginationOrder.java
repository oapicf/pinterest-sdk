package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Pinterest.Lib.PaginationOrder
 */
public enum PinterestLibPaginationOrder {
  
  ASCENDING("ASCENDING"),
  
  DESCENDING("DESCENDING");

  private final String value;

  PinterestLibPaginationOrder(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PinterestLibPaginationOrder fromValue(String value) {
    for (PinterestLibPaginationOrder b : PinterestLibPaginationOrder.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

