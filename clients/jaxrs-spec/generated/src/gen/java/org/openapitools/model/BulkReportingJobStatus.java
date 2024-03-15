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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static BulkReportingJobStatus fromString(String s) {
      for (BulkReportingJobStatus b : BulkReportingJobStatus.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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


