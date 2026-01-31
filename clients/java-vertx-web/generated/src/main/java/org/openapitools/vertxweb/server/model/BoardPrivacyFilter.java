package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BoardPrivacyFilter fromValue(String value) {
    for (BoardPrivacyFilter b : BoardPrivacyFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}