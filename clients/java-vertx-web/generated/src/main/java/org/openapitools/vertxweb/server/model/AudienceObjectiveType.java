package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 */
public enum AudienceObjectiveType {
  
  AWARENESS("AWARENESS"),
  
  CONSIDERATION("CONSIDERATION"),
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  CATALOG_SALES("CATALOG_SALES"),
  
  VIDEO_COMPLETION("VIDEO_COMPLETION"),
  
  SALES("SALES");

  private String value;

  AudienceObjectiveType(String value) {
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

  public static AudienceObjectiveType fromValue(String value) {
    for (AudienceObjectiveType b : AudienceObjectiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}