package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Audience type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Audience type
 */
public enum PinnerListType {
  
  CUSTOMER_LIST("CUSTOMER_LIST"),
  
  VISITOR("VISITOR"),
  
  ENGAGEMENT("ENGAGEMENT"),
  
  LOOKALIKE("LOOKALIKE"),
  
  ACTALIKE("ACTALIKE"),
  
  PERSONA("PERSONA");

  private String value;

  PinnerListType(String value) {
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

  public static PinnerListType fromValue(String value) {
    for (PinnerListType b : PinnerListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}