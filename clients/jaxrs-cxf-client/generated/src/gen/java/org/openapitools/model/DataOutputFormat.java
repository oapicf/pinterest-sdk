package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Format of generated report
 */
public enum DataOutputFormat {
  
  JSON("JSON"),
  
  CSV("CSV");

  private String value;

  DataOutputFormat(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DataOutputFormat fromValue(String value) {
    for (DataOutputFormat b : DataOutputFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

