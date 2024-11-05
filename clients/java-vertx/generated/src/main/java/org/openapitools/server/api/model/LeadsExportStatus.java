package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Status of a leads export job
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of a leads export job
 */
public enum LeadsExportStatus {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  FINISHED("FINISHED"),
  
  FAILED("FAILED");

  private String value;

  LeadsExportStatus(String value) {
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

  public static LeadsExportStatus fromValue(String value) {
    for (LeadsExportStatus b : LeadsExportStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}