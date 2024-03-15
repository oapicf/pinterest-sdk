package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Granularity
 */
public enum Granularity {
  
  TOTAL("TOTAL"),
  
  DAY("DAY"),
  
  HOUR("HOUR"),
  
  WEEK("WEEK"),
  
  MONTH("MONTH");

  private String value;

  Granularity(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Granularity fromValue(String value) {
    for (Granularity b : Granularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

