package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



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

  private String value;

  BoardPrivacyFilter(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BoardPrivacyFilter fromValue(String text) {
    for (BoardPrivacyFilter b : BoardPrivacyFilter.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


