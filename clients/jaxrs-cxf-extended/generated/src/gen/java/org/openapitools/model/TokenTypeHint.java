package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of token to revoke.
 */
public enum TokenTypeHint {
  
  ACCESS_TOKEN("access_token"),
  
  REFRESH_TOKEN("refresh_token");

  private String value;

  TokenTypeHint(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TokenTypeHint fromValue(String value) {
    for (TokenTypeHint b : TokenTypeHint.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

