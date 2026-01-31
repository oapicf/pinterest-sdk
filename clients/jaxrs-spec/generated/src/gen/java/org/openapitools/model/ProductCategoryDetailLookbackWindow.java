package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

    /**
     * Convert a String into BigDecimal, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ProductCategoryDetailLookbackWindow fromString(String s) {
      for (ProductCategoryDetailLookbackWindow b : ProductCategoryDetailLookbackWindow.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductCategoryDetailLookbackWindow fromValue(BigDecimal value) {
    for (ProductCategoryDetailLookbackWindow b : ProductCategoryDetailLookbackWindow.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


