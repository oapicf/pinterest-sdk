package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Audience sharing type: [\&quot;CUSTOM\&quot;, \&quot;SYNDICATED\&quot;]
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
  public static AudienceSharingType fromValue(String value) {
    for (AudienceSharingType b : AudienceSharingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

