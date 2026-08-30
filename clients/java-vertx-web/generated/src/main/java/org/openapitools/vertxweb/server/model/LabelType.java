package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Label type values.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Label type values.
 */
public enum LabelType {
  
  BRAND("BRAND"),
  
  CUSTOM("CUSTOM");

  private String value;

  LabelType(String value) {
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

  public static LabelType fromValue(String value) {
    for (LabelType b : LabelType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}