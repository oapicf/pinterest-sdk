package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GenderBucket fromValue(String value) {
    for (GenderBucket b : GenderBucket.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}