package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ConversionAttributionWindowDays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum ConversionAttributionWindowDays {
  
  NUMBER_0(new BigDecimal("0")),
  
  NUMBER_1(new BigDecimal("1")),
  
  NUMBER_7(new BigDecimal("7")),
  
  NUMBER_14(new BigDecimal("14")),
  
  NUMBER_30(new BigDecimal("30")),
  
  NUMBER_60(new BigDecimal("60"));

  private BigDecimal value;

  ConversionAttributionWindowDays(BigDecimal value) {
    this.value = value;
  }

    /**
     * Convert a String into BigDecimal, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ConversionAttributionWindowDays fromString(String s) {
      for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
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
  public static ConversionAttributionWindowDays fromValue(BigDecimal value) {
    for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


