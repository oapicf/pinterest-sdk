package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static GridClickType fromValue(String value) {
    for (GridClickType b : GridClickType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

