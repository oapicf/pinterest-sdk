package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static BulkUpsertStatus fromValue(String text) {
    for (BulkUpsertStatus b : BulkUpsertStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

