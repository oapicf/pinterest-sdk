package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;p&gt;Catalog hotel product group type&lt;/p&gt; &lt;p&gt;MERCHANT_CREATED: Product groups created by merchants. &lt;br&gt;ALL_LISTINGS: Includes every hotel item in your catalog.
 */
public enum CatalogsHotelProductGroupType {
  
  MERCHANT_CREATED("MERCHANT_CREATED"),
  
  ALL_LISTINGS("ALL_LISTINGS");

  private String value;

  CatalogsHotelProductGroupType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsHotelProductGroupType fromValue(String value) {
    for (CatalogsHotelProductGroupType b : CatalogsHotelProductGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

