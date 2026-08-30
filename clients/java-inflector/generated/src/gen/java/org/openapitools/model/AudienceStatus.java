package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Audience processing status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceStatus fromValue(String text) {
    for (AudienceStatus b : AudienceStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


