package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionProductReportBreakdownType fromValue(String text) {
    for (ConversionProductReportBreakdownType b : ConversionProductReportBreakdownType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

