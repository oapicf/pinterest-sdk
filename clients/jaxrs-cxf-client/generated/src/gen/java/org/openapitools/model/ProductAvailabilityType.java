package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Default availability for products in a feed.
 */
public enum ProductAvailabilityType {
  
  IN_STOCK("IN_STOCK"),
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  PREORDER("PREORDER");

  private String value;

  ProductAvailabilityType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductAvailabilityType fromValue(String value) {
    for (ProductAvailabilityType b : ProductAvailabilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

