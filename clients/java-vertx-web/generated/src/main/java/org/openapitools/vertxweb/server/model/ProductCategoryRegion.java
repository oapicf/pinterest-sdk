package org.openapitools.vertxweb.server.model;

import java.util.Objects;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductCategoryRegion fromValue(String value) {
    for (ProductCategoryRegion b : ProductCategoryRegion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}