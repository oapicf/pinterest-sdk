package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets BoardPrivacyFilter
 */
public enum BoardPrivacyFilter {
  
  ALL("ALL"),
  
  PUBLIC("PUBLIC"),
  
  PROTECTED("PROTECTED"),
  
  SECRET("SECRET"),
  
  PUBLIC_AND_SECRET("PUBLIC_AND_SECRET");

  private final String value;

  BoardPrivacyFilter(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BoardPrivacyFilter fromValue(String value) {
    for (BoardPrivacyFilter b : BoardPrivacyFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

