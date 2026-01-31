package org.openapitools.model;

import java.util.Objects;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ProductCategoryDetailLookbackWindow
 */
public enum ProductCategoryDetailLookbackWindow {
  
  NUMBER_90(new BigDecimal("90")),
  
  NUMBER_180(new BigDecimal("180")),
  
  NUMBER_365(new BigDecimal("365")),
  
  NUMBER_730(new BigDecimal("730"));

  private BigDecimal value;

  ProductCategoryDetailLookbackWindow(BigDecimal value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductCategoryDetailLookbackWindow fromValue(String text) {
    for (ProductCategoryDetailLookbackWindow b : ProductCategoryDetailLookbackWindow.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


