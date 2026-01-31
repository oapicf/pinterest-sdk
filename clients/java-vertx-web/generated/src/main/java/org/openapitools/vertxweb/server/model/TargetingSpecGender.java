package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingSpecGender
 */
public enum TargetingSpecGender {
  
  UNKNOWN("unknown"),
  
  MALE("male"),
  
  FEMALE("female");

  private String value;

  TargetingSpecGender(String value) {
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

  public static TargetingSpecGender fromValue(String value) {
    for (TargetingSpecGender b : TargetingSpecGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}