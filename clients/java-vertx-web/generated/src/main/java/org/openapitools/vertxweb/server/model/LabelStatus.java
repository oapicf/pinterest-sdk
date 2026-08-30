package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Label status values.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Label status values.
 */
public enum LabelStatus {
  
  ACTIVE("ACTIVE"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  LabelStatus(String value) {
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

  public static LabelStatus fromValue(String value) {
    for (LabelStatus b : LabelStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}