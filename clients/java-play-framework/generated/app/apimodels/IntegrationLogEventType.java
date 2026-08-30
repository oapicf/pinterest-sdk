package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Log event type for integration applications.
 */
public enum IntegrationLogEventType {
  
  APP("APP"),
  
  API("API");

  private final String value;

  IntegrationLogEventType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IntegrationLogEventType fromValue(String value) {
    for (IntegrationLogEventType b : IntegrationLogEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

