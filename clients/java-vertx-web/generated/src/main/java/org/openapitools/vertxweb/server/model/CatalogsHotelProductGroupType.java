package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Catalog hotel product group type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Catalog hotel product group type
 */
public enum CatalogsHotelProductGroupType {
  
  MERCHANT_CREATED("MERCHANT_CREATED"),
  
  ALL_LISTINGS("ALL_LISTINGS");

  private String value;

  CatalogsHotelProductGroupType(String value) {
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

  public static CatalogsHotelProductGroupType fromValue(String value) {
    for (CatalogsHotelProductGroupType b : CatalogsHotelProductGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}