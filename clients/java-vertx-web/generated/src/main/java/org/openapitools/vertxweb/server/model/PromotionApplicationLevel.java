package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Specify if the promotion is applied at ad group or item level.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionApplicationLevel fromValue(String value) {
    for (PromotionApplicationLevel b : PromotionApplicationLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}