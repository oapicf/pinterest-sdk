package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static AdShoppingPreviewCreativeType fromValue(String text) {
    for (AdShoppingPreviewCreativeType b : AdShoppingPreviewCreativeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

