package org.openapitools.model;



/**
 * Public ad targeting type with external names
 */
public enum PublicTargetingType {
  
  APPTYPE("APPTYPE"),
  
  GENDER("GENDER"),
  
  LOCALE("LOCALE"),
  
  AGE_BUCKET("AGE_BUCKET"),
  
  LOCATION("LOCATION"),
  
  GEO("GEO"),
  
  INTEREST("INTEREST"),
  
  KEYWORD("KEYWORD"),
  
  AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
  
  AUDIENCE_EXCLUDE("AUDIENCE_EXCLUDE");

  private String value;

  PublicTargetingType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PublicTargetingType fromValue(String value) {
    for (PublicTargetingType b : PublicTargetingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

