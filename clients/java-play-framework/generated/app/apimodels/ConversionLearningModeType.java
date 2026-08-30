package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * oCPM learn mode.
 */
public enum ConversionLearningModeType {
  
  NOT_ACTIVE("NOT_ACTIVE"),
  
  ACTIVE("ACTIVE");

  private final String value;

  ConversionLearningModeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionLearningModeType fromValue(String value) {
    for (ConversionLearningModeType b : ConversionLearningModeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

