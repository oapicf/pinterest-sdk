package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Pinterest.Lib.PaginationOrder
 */
public enum PinterestLibPaginationOrder {
  
  ASCENDING("ASCENDING"),
  
  DESCENDING("DESCENDING");

  private String value;

  PinterestLibPaginationOrder(String value) {
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

  public static PinterestLibPaginationOrder fromValue(String value) {
    for (PinterestLibPaginationOrder b : PinterestLibPaginationOrder.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}