package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to &#x60;DIRECT_TO_DESTINATION&#x60; by default for direct links supported ads. &#x60;grid_click_type&#x60; values provided will be ignored.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to `DIRECT_TO_DESTINATION` by default for direct links supported ads. `grid_click_type` values provided will be ignored.
 */
public enum GridClickType {
  
  CLOSEUP("CLOSEUP"),
  
  DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION");

  private String value;

  GridClickType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GridClickType fromValue(String text) {
    for (GridClickType b : GridClickType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


