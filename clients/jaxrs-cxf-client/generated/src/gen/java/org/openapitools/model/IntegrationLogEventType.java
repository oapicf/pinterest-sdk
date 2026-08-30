package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static IntegrationLogEventType fromValue(String value) {
    for (IntegrationLogEventType b : IntegrationLogEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

