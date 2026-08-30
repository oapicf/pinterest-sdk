package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BasePreferredMediaType
 */
public enum BasePreferredMediaType {
  
  VIDEO("VIDEO"),
  
  IMAGE("IMAGE");

  private String value;

  BasePreferredMediaType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BasePreferredMediaType fromValue(String value) {
    for (BasePreferredMediaType b : BasePreferredMediaType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

