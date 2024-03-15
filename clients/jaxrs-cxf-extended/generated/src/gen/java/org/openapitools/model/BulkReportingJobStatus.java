package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible status for a bulk reporting job
 */
public enum BulkReportingJobStatus {
  
  DOES_NOT_EXIST("DOES_NOT_EXIST"),
  
  FINISHED("FINISHED"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  EXPIRED("EXPIRED"),
  
  FAILED("FAILED"),
  
  CANCELLED("CANCELLED");

  private String value;

  BulkReportingJobStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BulkReportingJobStatus fromValue(String value) {
    for (BulkReportingJobStatus b : BulkReportingJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

