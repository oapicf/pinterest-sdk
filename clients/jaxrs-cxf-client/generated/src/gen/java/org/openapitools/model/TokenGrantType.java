package org.openapitools.model;



/**
 * The type of OAuth grant being requested.
 */
public enum TokenGrantType {
  
  AUTHORIZATION_CODE("authorization_code"),
  
  REFRESH_TOKEN("refresh_token"),
  
  CLIENT_CREDENTIALS("client_credentials");

  private String value;

  TokenGrantType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TokenGrantType fromValue(String value) {
    for (TokenGrantType b : TokenGrantType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

