package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

