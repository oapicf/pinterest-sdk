package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Audience processing status
 */
public enum AudienceStatus {
  
  INITIALIZING("INITIALIZING"),
  
  READY("READY"),
  
  TOO_SMALL("TOO_SMALL"),
  
  ELIGIBLE("ELIGIBLE"),
  
  PERSONAS_INELIGIBLE_SIZE("PERSONAS_INELIGIBLE_SIZE"),
  
  PERSONAS_INITIALIZING("PERSONAS_INITIALIZING");

  private final String value;

  AudienceStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceStatus fromValue(String value) {
    for (AudienceStatus b : AudienceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

