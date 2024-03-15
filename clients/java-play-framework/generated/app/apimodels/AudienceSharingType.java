package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]
 */
public enum AudienceSharingType {
  
  CUSTOM("CUSTOM"),
  
  SYNDICATED("SYNDICATED");

  private final String value;

  AudienceSharingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceSharingType fromValue(String value) {
    for (AudienceSharingType b : AudienceSharingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

