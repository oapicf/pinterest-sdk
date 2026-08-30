package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Whether to first sort the report by date or by ID
 */
public enum PrimarySort {
  
  BY_ID("BY_ID"),
  
  BY_DATE("BY_DATE");

  private final String value;

  PrimarySort(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PrimarySort fromValue(String value) {
    for (PrimarySort b : PrimarySort.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

