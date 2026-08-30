package org.openapitools.model;



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

