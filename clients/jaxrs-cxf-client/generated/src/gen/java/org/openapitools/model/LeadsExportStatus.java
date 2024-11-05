package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

