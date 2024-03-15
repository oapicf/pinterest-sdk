package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
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
  
  QUIZ("QUIZ");

  private String value;

  CreativeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CreativeType fromValue(String text) {
    for (CreativeType b : CreativeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

