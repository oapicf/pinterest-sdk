package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceUpdateOperationType fromValue(String text) {
    for (AudienceUpdateOperationType b : AudienceUpdateOperationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

