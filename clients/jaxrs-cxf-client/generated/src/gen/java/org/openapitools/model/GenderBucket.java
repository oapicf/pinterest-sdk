package org.openapitools.model;



/**
 * Gets or Sets GenderBucket
 */
public enum GenderBucket {
  
  MALE("MALE"),
  
  FEMALE("FEMALE"),
  
  UNSPECIFIED("UNSPECIFIED");

  private String value;

  GenderBucket(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GenderBucket fromValue(String value) {
    for (GenderBucket b : GenderBucket.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

