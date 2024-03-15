package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PlacementGroupType fromValue(String value) {
    for (PlacementGroupType b : PlacementGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

