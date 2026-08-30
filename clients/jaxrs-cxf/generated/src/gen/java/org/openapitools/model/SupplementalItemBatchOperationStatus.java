package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the batch operation
 */
public enum SupplementalItemBatchOperationStatus {
  
  PROCESSING("PROCESSING"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED");

  private String value;

  SupplementalItemBatchOperationStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SupplementalItemBatchOperationStatus fromValue(String value) {
    for (SupplementalItemBatchOperationStatus b : SupplementalItemBatchOperationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

