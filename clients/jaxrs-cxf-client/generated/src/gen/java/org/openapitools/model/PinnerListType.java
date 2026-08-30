package org.openapitools.model;



/**
 * Audience type
 */
public enum PinnerListType {
  
  CUSTOMER_LIST("CUSTOMER_LIST"),
  
  VISITOR("VISITOR"),
  
  ENGAGEMENT("ENGAGEMENT"),
  
  LOOKALIKE("LOOKALIKE"),
  
  ACTALIKE("ACTALIKE"),
  
  PERSONA("PERSONA");

  private String value;

  PinnerListType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PinnerListType fromValue(String value) {
    for (PinnerListType b : PinnerListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

