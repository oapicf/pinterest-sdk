package org.openapitools.model;



/**
 * Gets or Sets TargetingSpecListOperation
 */
public enum TargetingSpecListOperation {
  
  SET("SET"),
  
  ADD("ADD"),
  
  REMOVE("REMOVE");

  private String value;

  TargetingSpecListOperation(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingSpecListOperation fromValue(String value) {
    for (TargetingSpecListOperation b : TargetingSpecListOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

