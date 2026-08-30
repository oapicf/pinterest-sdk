package org.openapitools.model;



/**
 * Status of a single event in the response.
 */
public enum EventProcessingStatus {
  
  FAILED("failed"),
  
  PROCESSED("processed");

  private String value;

  EventProcessingStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventProcessingStatus fromValue(String value) {
    for (EventProcessingStatus b : EventProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

