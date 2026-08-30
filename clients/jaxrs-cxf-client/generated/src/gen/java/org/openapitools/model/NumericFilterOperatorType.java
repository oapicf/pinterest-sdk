package org.openapitools.model;



/**
 * Gets or Sets NumericFilterOperatorType
 */
public enum NumericFilterOperatorType {
  
  GREATER_THAN("GREATER_THAN"),
  
  GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
  
  LESS_THAN("LESS_THAN"),
  
  LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");

  private String value;

  NumericFilterOperatorType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NumericFilterOperatorType fromValue(String value) {
    for (NumericFilterOperatorType b : NumericFilterOperatorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

