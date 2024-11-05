package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Operation type to share a specific audience or revoke access to a previously shared audience
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */
public enum OperationType {
  
  SHARE("SHARE"),
  
  REVOKE("REVOKE");

  private String value;

  OperationType(String value) {
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

  public static OperationType fromValue(String value) {
    for (OperationType b : OperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}