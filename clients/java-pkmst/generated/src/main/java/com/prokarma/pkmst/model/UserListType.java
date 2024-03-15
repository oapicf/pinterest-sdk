package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static UserListType fromValue(String text) {
    for (UserListType b : UserListType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

