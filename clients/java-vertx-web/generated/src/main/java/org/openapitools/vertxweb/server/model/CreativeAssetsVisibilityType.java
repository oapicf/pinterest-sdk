package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Creative assets visibility.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Creative assets visibility.
 */
public enum CreativeAssetsVisibilityType {
  
  VISIBLE("VISIBLE"),
  
  HIDDEN("HIDDEN");

  private String value;

  CreativeAssetsVisibilityType(String value) {
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

  public static CreativeAssetsVisibilityType fromValue(String value) {
    for (CreativeAssetsVisibilityType b : CreativeAssetsVisibilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}