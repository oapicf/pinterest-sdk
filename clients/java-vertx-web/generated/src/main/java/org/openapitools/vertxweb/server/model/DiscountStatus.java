package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Discount status based on the current time and start and end time of discount
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Discount status based on the current time and start and end time of discount
 */
public enum DiscountStatus {
  
  OTHER("OTHER"),
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  SCHEDULED("SCHEDULED"),
  
  EXPIRED("EXPIRED");

  private String value;

  DiscountStatus(String value) {
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

  public static DiscountStatus fromValue(String value) {
    for (DiscountStatus b : DiscountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}