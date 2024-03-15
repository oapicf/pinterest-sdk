package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GridClickType fromValue(String value) {
    for (GridClickType b : GridClickType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

