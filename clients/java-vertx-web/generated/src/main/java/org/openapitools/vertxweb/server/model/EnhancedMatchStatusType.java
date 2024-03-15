package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The enhanced match status of the tag
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnhancedMatchStatusType fromValue(String value) {
    for (EnhancedMatchStatusType b : EnhancedMatchStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}