package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UserListType fromValue(String value) {
    for (UserListType b : UserListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

