package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingSpecGender fromValue(String value) {
    for (TargetingSpecGender b : TargetingSpecGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

