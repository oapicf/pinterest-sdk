package org.openapitools.model;



/**
 * Gets or Sets TrendType
 */
public enum TrendType {
  
  GROWING("growing"),
  
  MONTHLY("monthly"),
  
  YEARLY("yearly"),
  
  SEASONAL("seasonal");

  private String value;

  TrendType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrendType fromValue(String value) {
    for (TrendType b : TrendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

