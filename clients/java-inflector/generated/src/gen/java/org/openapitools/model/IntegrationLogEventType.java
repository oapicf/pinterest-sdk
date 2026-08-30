package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Log event type for integration applications.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Log event type for integration applications.
 */
public enum IntegrationLogEventType {
  
  APP("APP"),
  
  API("API");

  private String value;

  IntegrationLogEventType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IntegrationLogEventType fromValue(String text) {
    for (IntegrationLogEventType b : IntegrationLogEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


