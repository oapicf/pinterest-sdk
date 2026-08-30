package org.openapitools.vertxweb.server.model;

import java.util.Objects;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdShoppingPreviewCreativeType fromValue(String value) {
    for (AdShoppingPreviewCreativeType b : AdShoppingPreviewCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}