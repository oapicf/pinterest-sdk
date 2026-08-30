package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Conversion product attribution level
 */
public enum ConversionProductAttributionType {
  
  DEFAULT("DEFAULT"),
  
  BRAND_ATTRIBUTION("BRAND_ATTRIBUTION");

  private String value;

  ConversionProductAttributionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionProductAttributionType fromValue(String value) {
    for (ConversionProductAttributionType b : ConversionProductAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

