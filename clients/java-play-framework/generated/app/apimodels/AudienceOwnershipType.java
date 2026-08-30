package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Filter audiences by ownership type.
 */
public enum AudienceOwnershipType {
  
  OWNED("OWNED"),
  
  RECEIVED("RECEIVED");

  private final String value;

  AudienceOwnershipType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceOwnershipType fromValue(String value) {
    for (AudienceOwnershipType b : AudienceOwnershipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

