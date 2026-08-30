package org.openapitools.model;



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

