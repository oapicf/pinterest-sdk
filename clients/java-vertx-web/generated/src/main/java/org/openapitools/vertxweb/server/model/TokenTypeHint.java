package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The type of token to revoke.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TokenTypeHint fromValue(String value) {
    for (TokenTypeHint b : TokenTypeHint.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}