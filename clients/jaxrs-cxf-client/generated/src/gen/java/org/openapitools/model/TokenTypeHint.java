package org.openapitools.model;



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

