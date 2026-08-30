package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of token to revoke.
 */
public enum TokenTypeHint {
  
  ACCESS_TOKEN("access_token"),
  
  REFRESH_TOKEN("refresh_token");

  private final String value;

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

