package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Audience sharing type: [\&quot;CUSTOM\&quot;, \&quot;SYNDICATED\&quot;]
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceSharingType fromValue(String value) {
    for (AudienceSharingType b : AudienceSharingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}