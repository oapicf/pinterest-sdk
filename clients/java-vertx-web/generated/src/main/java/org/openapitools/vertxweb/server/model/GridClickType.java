package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to &#x60;DIRECT_TO_DESTINATION&#x60; by default for direct links supported ads. &#x60;grid_click_type&#x60; values provided will be ignored.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to &#x60;DIRECT_TO_DESTINATION&#x60; by default for direct links supported ads. &#x60;grid_click_type&#x60; values provided will be ignored.
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