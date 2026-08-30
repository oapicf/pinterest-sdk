package org.openapitools.model;



/**
 * Whether to first sort the report by date or by ID
 */
public enum PrimarySort {
  
  BY_ID("BY_ID"),
  
  BY_DATE("BY_DATE");

  private String value;

  PrimarySort(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PrimarySort fromValue(String value) {
    for (PrimarySort b : PrimarySort.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

