package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Bulk file output format
 */
public enum BulkOutputFormat {
  
  CSV("CSV"),
  
  JSON("JSON");

  private String value;

  BulkOutputFormat(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BulkOutputFormat fromValue(String value) {
    for (BulkOutputFormat b : BulkOutputFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

