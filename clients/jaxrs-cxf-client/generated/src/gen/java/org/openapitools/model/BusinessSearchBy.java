package org.openapitools.model;



/**
 * The names of fields that business accounts are searched by
 */
public enum BusinessSearchBy {
  
  FULL_NAME("FULL_NAME"),
  
  USERNAME("USERNAME"),
  
  BUSINESS_ID("BUSINESS_ID"),
  
  EMAIL("EMAIL");

  private String value;

  BusinessSearchBy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessSearchBy fromValue(String value) {
    for (BusinessSearchBy b : BusinessSearchBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

