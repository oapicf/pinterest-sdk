package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets QueryLabelTypesItems
 */
public enum QueryLabelTypesItems {
  
  BRAND("BRAND"),
  
  CUSTOM("CUSTOM");

  private String value;

  QueryLabelTypesItems(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryLabelTypesItems fromValue(String value) {
    for (QueryLabelTypesItems b : QueryLabelTypesItems.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

