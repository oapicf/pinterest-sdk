package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Audience processing status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Audience processing status
 */
public enum AudienceStatus {
  
  INITIALIZING("INITIALIZING"),
  
  READY("READY"),
  
  TOO_SMALL("TOO_SMALL"),
  
  ELIGIBLE("ELIGIBLE"),
  
  PERSONAS_INELIGIBLE_SIZE("PERSONAS_INELIGIBLE_SIZE"),
  
  PERSONAS_INITIALIZING("PERSONAS_INITIALIZING");

  private String value;

  AudienceStatus(String value) {
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

  public static AudienceStatus fromValue(String value) {
    for (AudienceStatus b : AudienceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}