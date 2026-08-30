package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Type of user conversion event.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MsotEventName fromValue(String value) {
    for (MsotEventName b : MsotEventName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}