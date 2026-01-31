package org.openapitools.model;



/**
 * Overall status of event quality score.
 */
public enum OverallStatusOptions {
  
  NEEDS_IMPROVEMENT("NEEDS_IMPROVEMENT"),
  
  FAIR("FAIR"),
  
  GOOD("GOOD");

  private String value;

  OverallStatusOptions(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OverallStatusOptions fromValue(String value) {
    for (OverallStatusOptions b : OverallStatusOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

