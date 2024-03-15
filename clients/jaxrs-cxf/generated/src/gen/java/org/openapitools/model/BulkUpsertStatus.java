package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BulkUpsertStatus
 */
public enum BulkUpsertStatus {
  
  RUNNING("RUNNING"),
  
  SUCCEEDED("SUCCEEDED"),
  
  FAILED("FAILED");

  private String value;

  BulkUpsertStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BulkUpsertStatus fromValue(String value) {
    for (BulkUpsertStatus b : BulkUpsertStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

