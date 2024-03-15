package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]
 */
public enum AudienceSharingType {
  
  CUSTOM("CUSTOM"),
  
  SYNDICATED("SYNDICATED");

  private String value;

  AudienceSharingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceSharingType fromValue(String text) {
    for (AudienceSharingType b : AudienceSharingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

