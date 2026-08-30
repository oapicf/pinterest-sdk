package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Conversion product attribution level
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static ConversionProductAttributionType fromValue(String text) {
    for (ConversionProductAttributionType b : ConversionProductAttributionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


