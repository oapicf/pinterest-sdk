package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Status of a single event in the response.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EventProcessingStatus fromValue(String text) {
    for (EventProcessingStatus b : EventProcessingStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


