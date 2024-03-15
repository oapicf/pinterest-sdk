package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Where a user is taken after clicking on an ad in grid.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Where a user is taken after clicking on an ad in grid.
 */
public enum GridClickType {
  
  CLOSEUP("CLOSEUP"),
  
  DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION");

  private String value;

  GridClickType(String value) {
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

  public static GridClickType fromValue(String value) {
    for (GridClickType b : GridClickType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}