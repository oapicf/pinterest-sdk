package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The enhanced match status of the tag
 */
public enum EnhancedMatchStatusType {
  
  UNKNOWN("UNKNOWN"),
  
  NOT_VALIDATED("NOT_VALIDATED"),
  
  VALIDATING_IN_PROGRESS("VALIDATING_IN_PROGRESS"),
  
  VALIDATION_COMPLETE("VALIDATION_COMPLETE"),
  
  NULL("null");

  private final String value;

  EnhancedMatchStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnhancedMatchStatusType fromValue(String value) {
    for (EnhancedMatchStatusType b : EnhancedMatchStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

