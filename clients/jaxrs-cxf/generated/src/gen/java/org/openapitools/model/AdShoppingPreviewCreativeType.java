package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdShoppingPreviewCreativeType
 */
public enum AdShoppingPreviewCreativeType {
  
  SHOPPING("SHOPPING"),
  
  COLLECTION("COLLECTION"),
  
  CAROUSEL("CAROUSEL"),
  
  MAX_WIDTH_COLLECTION("MAX_WIDTH_COLLECTION");

  private String value;

  AdShoppingPreviewCreativeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdShoppingPreviewCreativeType fromValue(String value) {
    for (AdShoppingPreviewCreativeType b : AdShoppingPreviewCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

