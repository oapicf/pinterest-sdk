package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Log level type for integration applications.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Log level type for integration applications.
 */
public enum IntegrationLogLevel {
  
  INFO("INFO"),
  
  WARN("WARN"),
  
  ERROR("ERROR");

  private String value;

  IntegrationLogLevel(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IntegrationLogLevel fromValue(String value) {
    for (IntegrationLogLevel b : IntegrationLogLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}