package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static NonNullableProductAvailabilityType fromValue(String value) {
    for (NonNullableProductAvailabilityType b : NonNullableProductAvailabilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

