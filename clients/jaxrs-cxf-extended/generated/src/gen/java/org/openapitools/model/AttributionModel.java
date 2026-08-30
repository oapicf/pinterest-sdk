package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Attribution model used to attribute the conversion event.
 */
public enum AttributionModel {
  
  FIRST_TOUCH("first_touch"),
  
  LAST_TOUCH("last_touch"),
  
  MULTI_TOUCH("multi_touch"),
  
  MMM("mmm");

  private String value;

  AttributionModel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AttributionModel fromValue(String value) {
    for (AttributionModel b : AttributionModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

