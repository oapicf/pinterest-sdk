package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Audience operation type (update or remove).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Audience operation type (update or remove).
 */
public enum AudienceUpdateOperationType {
  
  UPDATE("UPDATE"),
  
  REMOVE("REMOVE");

  private String value;

  AudienceUpdateOperationType(String value) {
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

  public static AudienceUpdateOperationType fromValue(String value) {
    for (AudienceUpdateOperationType b : AudienceUpdateOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}