package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Placement type for bid multiplier targeting.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlacementType fromValue(String value) {
    for (PlacementType b : PlacementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}