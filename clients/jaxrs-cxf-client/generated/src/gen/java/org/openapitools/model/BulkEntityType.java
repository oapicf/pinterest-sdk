package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Refers ads entity type
 */
public enum BulkEntityType {
  
  CAMPAIGN("CAMPAIGN"),
  
  AD_GROUP("AD_GROUP"),
  
  PRODUCT_GROUP("PRODUCT_GROUP"),
  
  AD("AD"),
  
  KEYWORD("KEYWORD");

  private String value;

  BulkEntityType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BulkEntityType fromValue(String value) {
    for (BulkEntityType b : BulkEntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

