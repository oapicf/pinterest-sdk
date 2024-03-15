package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

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

  private String value;

  EnhancedMatchStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnhancedMatchStatusType fromValue(String text) {
    for (EnhancedMatchStatusType b : EnhancedMatchStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

