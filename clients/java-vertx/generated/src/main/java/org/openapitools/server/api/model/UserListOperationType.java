package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * User list operation type (add or remove)
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * User list operation type (add or remove)
 */
public enum UserListOperationType {
  
  ADD("ADD"),
  
  REMOVE("REMOVE");

  private String value;

  UserListOperationType(String value) {
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

  public static UserListOperationType fromValue(String value) {
    for (UserListOperationType b : UserListOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}