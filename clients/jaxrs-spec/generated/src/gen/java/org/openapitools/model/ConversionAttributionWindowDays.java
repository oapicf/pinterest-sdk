package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ConversionAttributionWindowDays
 */
public enum ConversionAttributionWindowDays {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_7(7),
  
  NUMBER_14(14),
  
  NUMBER_30(30),
  
  NUMBER_60(60);

  private Integer value;

  ConversionAttributionWindowDays(Integer value) {
    this.value = value;
  }

    /**
     * Convert a String into Integer, as specified in the
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
  public static ConversionAttributionWindowDays fromValue(Integer value) {
    for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


