package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */
public enum CreativeType {
  
  REGULAR("REGULAR"),
  
  VIDEO("VIDEO"),
  
  SHOPPING("SHOPPING"),
  
  CAROUSEL("CAROUSEL"),
  
  MAX_VIDEO("MAX_VIDEO"),
  
  SHOP_THE_PIN("SHOP_THE_PIN"),
  
  COLLECTION("COLLECTION"),
  
  IDEA("IDEA"),
  
  SHOWCASE("SHOWCASE"),
  
  QUIZ("QUIZ"),
  
  COLLAGE("COLLAGE"),
  
  MAX_WIDTH_REGULAR_COLLECTION("MAX_WIDTH_REGULAR_COLLECTION"),
  
  MAX_WIDTH_VIDEO_COLLECTION("MAX_WIDTH_VIDEO_COLLECTION");

  private String value;

  CreativeType(String value) {
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

  public static CreativeType fromValue(String value) {
    for (CreativeType b : CreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}