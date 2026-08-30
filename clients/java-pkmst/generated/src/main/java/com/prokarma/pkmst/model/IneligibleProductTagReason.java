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
 * Reason why a product pin is ineligible for tagging.
 */
public enum IneligibleProductTagReason {
  
  PIN_MISSING("PIN_MISSING"),
  
  PIN_IS_PRIVATE("PIN_IS_PRIVATE"),
  
  PRODUCT_METADATA_MISSING("PRODUCT_METADATA_MISSING"),
  
  PIN_NOT_FROM_VERIFIED_DOMAIN("PIN_NOT_FROM_VERIFIED_DOMAIN"),
  
  PIN_NOT_FROM_SAME_USER_AS_HERO_PIN("PIN_NOT_FROM_SAME_USER_AS_HERO_PIN");

  private String value;

  IneligibleProductTagReason(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IneligibleProductTagReason fromValue(String text) {
    for (IneligibleProductTagReason b : IneligibleProductTagReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

