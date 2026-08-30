package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of OAuth grant being requested.
 */
public enum TokenGrantType {
  
  AUTHORIZATION_CODE("authorization_code"),
  
  REFRESH_TOKEN("refresh_token"),
  
  CLIENT_CREDENTIALS("client_credentials");

  private final String value;

  TokenGrantType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TokenGrantType fromValue(String value) {
    for (TokenGrantType b : TokenGrantType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

