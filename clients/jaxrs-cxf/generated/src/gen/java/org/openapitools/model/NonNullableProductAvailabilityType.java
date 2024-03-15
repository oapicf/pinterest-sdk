package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Product availability.
 */
public enum NonNullableProductAvailabilityType {
  
  IN_STOCK("IN_STOCK"),
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  PREORDER("PREORDER");

  private String value;

  NonNullableProductAvailabilityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NonNullableProductAvailabilityType fromValue(String value) {
    for (NonNullableProductAvailabilityType b : NonNullableProductAvailabilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

