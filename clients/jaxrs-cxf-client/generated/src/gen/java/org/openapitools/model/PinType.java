package org.openapitools.model;



/**
 * Gets or Sets PinType
 */
public enum PinType {
  
  PRIVATE("PRIVATE");

  private String value;

  PinType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PinType fromValue(String value) {
    for (PinType b : PinType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

