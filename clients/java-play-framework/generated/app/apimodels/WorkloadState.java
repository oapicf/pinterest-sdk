package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Workload processing state
 */
public enum WorkloadState {
  
  NOT_STARTED("NOT_STARTED"),
  
  RUNNING("RUNNING"),
  
  PAUSED("PAUSED"),
  
  SUCCEEDED("SUCCEEDED"),
  
  FAILED("FAILED");

  private final String value;

  WorkloadState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WorkloadState fromValue(String value) {
    for (WorkloadState b : WorkloadState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

