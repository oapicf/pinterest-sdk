package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Refers ads entity type. Schedule enum is only applicable to beta users
 */
public enum BulkEntityType {
  
  CAMPAIGN("CAMPAIGN"),
  
  AD_GROUP("AD_GROUP"),
  
  PRODUCT_GROUP("PRODUCT_GROUP"),
  
  AD("AD"),
  
  KEYWORD("KEYWORD"),
  
  LABEL("LABEL"),
  
  SCHEDULE("SCHEDULE");

  private String value;

  BulkEntityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BulkEntityType fromValue(String value) {
    for (BulkEntityType b : BulkEntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

