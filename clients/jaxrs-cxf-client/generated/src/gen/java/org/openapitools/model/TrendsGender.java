package org.openapitools.model;



/**
 * Gender category for trends demographic distribution.
 */
public enum TrendsGender {
  
  MALE("male"),
  
  FEMALE("female"),
  
  UNSPECIFIED("unspecified");

  private String value;

  TrendsGender(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrendsGender fromValue(String value) {
    for (TrendsGender b : TrendsGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

