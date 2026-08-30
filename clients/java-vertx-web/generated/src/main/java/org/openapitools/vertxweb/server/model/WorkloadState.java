package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Workload processing state
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Workload processing state
 */
public enum WorkloadState {
  
  NOT_STARTED("NOT_STARTED"),
  
  RUNNING("RUNNING"),
  
  PAUSED("PAUSED"),
  
  SUCCEEDED("SUCCEEDED"),
  
  FAILED("FAILED");

  private String value;

  WorkloadState(String value) {
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

  public static WorkloadState fromValue(String value) {
    for (WorkloadState b : WorkloadState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}