package org.openapitools.model;



/**
 * Gets or Sets NullablePartnerType
 */
public enum NullablePartnerType {
  
  INTERNAL("INTERNAL"),
  
  EXTERNAL("EXTERNAL");

  private String value;

  NullablePartnerType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NullablePartnerType fromValue(String value) {
    for (NullablePartnerType b : NullablePartnerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

