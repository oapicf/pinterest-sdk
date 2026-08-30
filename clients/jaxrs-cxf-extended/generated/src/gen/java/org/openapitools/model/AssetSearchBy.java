package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The field to search member assets by
 */
public enum AssetSearchBy {
  
  NAME("NAME"),
  
  ID("ID"),
  
  NAME_OR_ID("NAME_OR_ID"),
  
  OWNER_NAME("OWNER_NAME"),
  
  NAME_OR_OWNER("NAME_OR_OWNER");

  private String value;

  AssetSearchBy(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AssetSearchBy fromValue(String value) {
    for (AssetSearchBy b : AssetSearchBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

