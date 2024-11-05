package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LeadsExportStatus fromValue(String value) {
    for (LeadsExportStatus b : LeadsExportStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

