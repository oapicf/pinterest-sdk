package org.openapitools.model;

import java.util.Objects;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionAttributionWindowDays fromValue(String text) {
    for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

