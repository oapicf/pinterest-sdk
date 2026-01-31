package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BoardUpdatePrivacy
 */
public enum BoardUpdatePrivacy {
  
  PUBLIC("PUBLIC"),
  
  SECRET("SECRET");

  private String value;

  BoardUpdatePrivacy(String value) {
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

  public static BoardUpdatePrivacy fromValue(String value) {
    for (BoardUpdatePrivacy b : BoardUpdatePrivacy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}