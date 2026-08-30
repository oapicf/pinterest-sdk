package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Indicate targeting template is active or Deleted
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingTemplateStatus fromValue(String value) {
    for (TargetingTemplateStatus b : TargetingTemplateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}