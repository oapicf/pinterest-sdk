package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Placement type for bid multiplier targeting.
 */
public enum PlacementType {
  
  SEARCH("SEARCH"),
  
  BROWSE("BROWSE"),
  
  RELATED_PINS("RELATED_PINS");

  private String value;

  PlacementType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PlacementType fromValue(String value) {
    for (PlacementType b : PlacementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

