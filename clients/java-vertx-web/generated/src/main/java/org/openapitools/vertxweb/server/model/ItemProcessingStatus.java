package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The status of the item processing record
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the item processing record
 */
public enum ItemProcessingStatus {
  
  SUCCESS("SUCCESS"),
  
  FAILURE("FAILURE"),
  
  PROCESSING("PROCESSING");

  private String value;

  ItemProcessingStatus(String value) {
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

  public static ItemProcessingStatus fromValue(String value) {
    for (ItemProcessingStatus b : ItemProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}