package org.openapitools.model;



/**
 * Gets or Sets PinFilter
 */
public enum PinFilter {
  
  EXCLUDE_NATIVE("exclude_native"),
  
  EXCLUDE_REPINS("exclude_repins"),
  
  HAS_BEEN_PROMOTED("has_been_promoted");

  private String value;

  PinFilter(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PinFilter fromValue(String value) {
    for (PinFilter b : PinFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

