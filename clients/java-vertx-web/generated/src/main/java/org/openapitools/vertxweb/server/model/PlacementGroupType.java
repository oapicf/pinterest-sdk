package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Campaign placement group type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Campaign placement group type
 */
public enum PlacementGroupType {
  
  ALL("ALL"),
  
  SEARCH("SEARCH"),
  
  BROWSE("BROWSE"),
  
  OTHER("OTHER");

  private String value;

  PlacementGroupType(String value) {
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

  public static PlacementGroupType fromValue(String value) {
    for (PlacementGroupType b : PlacementGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}