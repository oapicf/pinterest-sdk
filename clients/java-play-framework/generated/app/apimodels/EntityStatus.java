package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Entity status
 */
public enum EntityStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  ARCHIVED("ARCHIVED");

  private final String value;

  EntityStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EntityStatus fromValue(String value) {
    for (EntityStatus b : EntityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

