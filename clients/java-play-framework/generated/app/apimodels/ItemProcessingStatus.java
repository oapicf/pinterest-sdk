package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The status of the item processing record
 */
public enum ItemProcessingStatus {
  
  SUCCESS("SUCCESS"),
  
  FAILURE("FAILURE"),
  
  PROCESSING("PROCESSING");

  private final String value;

  ItemProcessingStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ItemProcessingStatus fromValue(String value) {
    for (ItemProcessingStatus b : ItemProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

