package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * The enhanced match status of the tag
 */
public enum EnhancedMatchStatusType {
  
  UNKNOWN("UNKNOWN"),
  
  NOT_VALIDATED("NOT_VALIDATED"),
  
  VALIDATING_IN_PROGRESS("VALIDATING_IN_PROGRESS"),
  
  VALIDATION_COMPLETE("VALIDATION_COMPLETE");

  private String value;

  EnhancedMatchStatusType(String value) {
    this.value = value;
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
    return null;
  }

}

