package org.openapitools.model;



/**
 * Quiz ad tie breaker type, default is RANDOM
 */
public enum TieBreakerType {
  
  RANDOM("RANDOM"),
  
  CUSTOM("CUSTOM");

  private String value;

  TieBreakerType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TieBreakerType fromValue(String value) {
    for (TieBreakerType b : TieBreakerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

