package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AudienceShareType
 */
public enum AudienceShareType {
  
  SHARED("SHARED"),
  
  RECEIVED("RECEIVED");

  private String value;

  AudienceShareType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceShareType fromValue(String text) {
    for (AudienceShareType b : AudienceShareType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

