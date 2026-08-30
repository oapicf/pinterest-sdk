package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

