package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Conversion product attribution level
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionProductAttributionType fromValue(String value) {
    for (ConversionProductAttributionType b : ConversionProductAttributionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}