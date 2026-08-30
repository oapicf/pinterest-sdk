package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
 */
public enum CustomerListStatus {
  
  PROCESSING("PROCESSING"),
  
  READY("READY"),
  
  TOO_SMALL("TOO_SMALL"),
  
  UPLOADING("UPLOADING");

  private final String value;

  CustomerListStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CustomerListStatus fromValue(String value) {
    for (CustomerListStatus b : CustomerListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

