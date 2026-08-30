package org.openapitools.model;



/**
 * Gets or Sets FilterOperatorType
 */
public enum FilterOperatorType {
  
  IS("IS"),
  
  CONTAINS("CONTAINS");

  private String value;

  FilterOperatorType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FilterOperatorType fromValue(String value) {
    for (FilterOperatorType b : FilterOperatorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

