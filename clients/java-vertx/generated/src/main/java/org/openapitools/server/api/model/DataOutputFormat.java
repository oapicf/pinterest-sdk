package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Format of generated report
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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