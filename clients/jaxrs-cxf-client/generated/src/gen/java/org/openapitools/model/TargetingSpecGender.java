package org.openapitools.model;



/**
 * Gets or Sets TargetingSpecGender
 */
public enum TargetingSpecGender {
  
  UNKNOWN("unknown"),
  
  MALE("male"),
  
  FEMALE("female");

  private String value;

  TargetingSpecGender(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingSpecGender fromValue(String value) {
    for (TargetingSpecGender b : TargetingSpecGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

