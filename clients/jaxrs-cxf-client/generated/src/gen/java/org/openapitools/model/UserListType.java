package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * User list type
 */
public enum UserListType {
  
  EMAIL("EMAIL"),
  
  IDFA("IDFA"),
  
  MAID("MAID"),
  
  LR_ID("LR_ID"),
  
  DLX_ID("DLX_ID"),
  
  HASHED_PINNER_ID("HASHED_PINNER_ID");

  private String value;

  UserListType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserListType fromValue(String value) {
    for (UserListType b : UserListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

