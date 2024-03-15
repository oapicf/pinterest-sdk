package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BulkEntityType fromValue(String text) {
    for (BulkEntityType b : BulkEntityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

