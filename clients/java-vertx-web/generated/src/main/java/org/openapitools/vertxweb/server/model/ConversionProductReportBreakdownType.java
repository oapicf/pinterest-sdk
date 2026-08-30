package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ConversionProductReportBreakdownType
 */
public enum ConversionProductReportBreakdownType {
  
  PRODUCT_BRAND("PRODUCT_BRAND"),
  
  PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
  
  PRODUCT_BRAND_AND_CATEGORY("PRODUCT_BRAND_AND_CATEGORY"),
  
  PRODUCT_SKU("PRODUCT_SKU"),
  
  PRODUCT_SKU_GROUP("PRODUCT_SKU_GROUP");

  private String value;

  ConversionProductReportBreakdownType(String value) {
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

  public static ConversionProductReportBreakdownType fromValue(String value) {
    for (ConversionProductReportBreakdownType b : ConversionProductReportBreakdownType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}