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
 * Type of user conversion event.
 */
public enum MsotEventName {
  
  ADD_TO_CART("add_to_cart"),
  
  CHECKOUT("checkout"),
  
  LEAD("lead"),
  
  SIGNUP("signup");

  private String value;

  MsotEventName(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MsotEventName fromValue(String text) {
    for (MsotEventName b : MsotEventName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

