package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Availability of the item
 */
public enum ItemAvailability {
  
  IN_STOCK("in stock"),
  
  OUT_OF_STOCK("out of stock"),
  
  PREORDER("preorder");

  private String value;

  ItemAvailability(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ItemAvailability fromValue(String value) {
    for (ItemAvailability b : ItemAvailability.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

