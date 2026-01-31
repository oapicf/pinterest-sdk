package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ProductCategoriesEngagementType
 */
public enum ProductCategoriesEngagementType {
  
  ENGAGEMENT("ENGAGEMENT"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  SAVE("SAVE");

  private String value;

  ProductCategoriesEngagementType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductCategoriesEngagementType fromValue(String value) {
    for (ProductCategoriesEngagementType b : ProductCategoriesEngagementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

