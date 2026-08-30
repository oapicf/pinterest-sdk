package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of a single event in the response.
 */
public enum EventProcessingStatus {
  
  FAILED("failed"),
  
  PROCESSED("processed");

  private final String value;

  EventProcessingStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EventProcessingStatus fromValue(String value) {
    for (EventProcessingStatus b : EventProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

