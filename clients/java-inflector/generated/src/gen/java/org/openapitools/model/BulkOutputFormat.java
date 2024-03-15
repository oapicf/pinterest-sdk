package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Bulk file output format
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BulkOutputFormat fromValue(String text) {
    for (BulkOutputFormat b : BulkOutputFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


