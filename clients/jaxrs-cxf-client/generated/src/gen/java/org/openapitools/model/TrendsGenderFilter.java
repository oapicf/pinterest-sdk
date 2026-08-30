package org.openapitools.model;



/**
 * Gender category for trends demographic distribution.
 */
public enum TrendsGenderFilter {
  
  MALE("male"),
  
  FEMALE("female"),
  
  UNKNOWN("unknown");

  private String value;

  TrendsGenderFilter(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrendsGenderFilter fromValue(String value) {
    for (TrendsGenderFilter b : TrendsGenderFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

