package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Order Line Status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Order Line Status
 */
public enum OrderLineStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  DELETED("DELETED");

  private String value;

  OrderLineStatus(String value) {
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

  public static OrderLineStatus fromValue(String value) {
    for (OrderLineStatus b : OrderLineStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}