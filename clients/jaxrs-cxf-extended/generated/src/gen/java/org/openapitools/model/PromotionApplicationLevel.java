package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specify if the promotion is applied at ad group or item level.
 */
public enum PromotionApplicationLevel {
  
  NONE("NONE"),
  
  ITEM("ITEM"),
  
  AD_GROUP("AD_GROUP");

  private String value;

  PromotionApplicationLevel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PromotionApplicationLevel fromValue(String value) {
    for (PromotionApplicationLevel b : PromotionApplicationLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

