package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * oCPM learn mode.
 */
public enum ConversionLearningModeType {
  
  NOT_ACTIVE("NOT_ACTIVE"),
  
  ACTIVE("ACTIVE");

  private String value;

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

