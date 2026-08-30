package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Filter audiences by ownership type.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Filter audiences by ownership type.
 */
public enum AudienceOwnershipType {
  
  OWNED("OWNED"),
  
  RECEIVED("RECEIVED");

  private String value;

  AudienceOwnershipType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudienceOwnershipType fromValue(String text) {
    for (AudienceOwnershipType b : AudienceOwnershipType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


