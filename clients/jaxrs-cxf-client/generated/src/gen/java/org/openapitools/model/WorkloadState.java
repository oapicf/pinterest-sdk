package org.openapitools.model;



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

