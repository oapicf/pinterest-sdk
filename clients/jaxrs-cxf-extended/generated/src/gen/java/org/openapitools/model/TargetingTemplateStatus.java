package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicate targeting template is active or Deleted
 */
public enum TargetingTemplateStatus {
  
  ACTIVE("ACTIVE"),
  
  DELETED("DELETED");

  private String value;

  TargetingTemplateStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingTemplateStatus fromValue(String value) {
    for (TargetingTemplateStatus b : TargetingTemplateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

