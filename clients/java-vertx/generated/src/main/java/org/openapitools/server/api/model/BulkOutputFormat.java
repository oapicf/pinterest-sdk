package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Bulk file output format
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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