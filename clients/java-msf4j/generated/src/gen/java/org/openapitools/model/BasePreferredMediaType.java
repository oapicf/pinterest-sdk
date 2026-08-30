package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static BasePreferredMediaType fromValue(String text) {
    for (BasePreferredMediaType b : BasePreferredMediaType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

