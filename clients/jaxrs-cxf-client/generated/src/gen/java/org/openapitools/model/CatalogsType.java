package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Type of the catalog entity.
 */
public enum CatalogsType {
  
  RETAIL("RETAIL"),
  
  HOTEL("HOTEL");

  private String value;

  CatalogsType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogsType fromValue(String value) {
    for (CatalogsType b : CatalogsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

