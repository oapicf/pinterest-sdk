package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ConversionAttributionWindowDays
 */
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

  @JsonValue
  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionAttributionWindowDays fromValue(BigDecimal value) {
    for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}