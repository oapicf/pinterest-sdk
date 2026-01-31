package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets GenderBucket
 */
public enum GenderBucket {
  
  MALE("MALE"),
  
  FEMALE("FEMALE"),
  
  UNSPECIFIED("UNSPECIFIED");

  private String value;

  GenderBucket(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GenderBucket fromValue(String text) {
    for (GenderBucket b : GenderBucket.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

