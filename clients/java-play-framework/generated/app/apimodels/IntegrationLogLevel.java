package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Log level type for integration applications.
 */
public enum IntegrationLogLevel {
  
  INFO("INFO"),
  
  WARN("WARN"),
  
  ERROR("ERROR");

  private final String value;

  IntegrationLogLevel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IntegrationLogLevel fromValue(String value) {
    for (IntegrationLogLevel b : IntegrationLogLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

