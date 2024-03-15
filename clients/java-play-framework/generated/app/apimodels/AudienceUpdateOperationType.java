package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Audience operation type (update or remove).
 */
public enum AudienceUpdateOperationType {
  
  UPDATE("UPDATE"),
  
  REMOVE("REMOVE");

  private final String value;

  AudienceUpdateOperationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceUpdateOperationType fromValue(String value) {
    for (AudienceUpdateOperationType b : AudienceUpdateOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

