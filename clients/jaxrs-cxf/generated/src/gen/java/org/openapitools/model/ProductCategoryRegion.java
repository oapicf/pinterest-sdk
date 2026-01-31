package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ProductCategoryRegion
 */
public enum ProductCategoryRegion {
  
  US("US"),
  
  GB_IE("GB+IE"),
  
  CA("CA");

  private String value;

  ProductCategoryRegion(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductCategoryRegion fromValue(String value) {
    for (ProductCategoryRegion b : ProductCategoryRegion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

