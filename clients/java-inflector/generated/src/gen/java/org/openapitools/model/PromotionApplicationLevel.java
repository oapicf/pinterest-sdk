package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Specify if the promotion is applied at ad group or item level.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static PromotionApplicationLevel fromValue(String text) {
    for (PromotionApplicationLevel b : PromotionApplicationLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


