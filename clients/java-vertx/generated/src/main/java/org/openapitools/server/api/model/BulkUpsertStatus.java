package org.openapitools.server.api.model;

import java.util.Objects;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BulkUpsertStatus fromValue(String value) {
    for (BulkUpsertStatus b : BulkUpsertStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}