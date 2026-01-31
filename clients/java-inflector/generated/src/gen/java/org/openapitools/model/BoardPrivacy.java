package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets BoardPrivacy
 */
public enum BoardPrivacy {
  
  PUBLIC("PUBLIC"),
  
  PROTECTED("PROTECTED"),
  
  SECRET("SECRET");

  private String value;

  BoardPrivacy(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BoardPrivacy fromValue(String text) {
    for (BoardPrivacy b : BoardPrivacy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


