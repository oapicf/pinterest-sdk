package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static TargetingSpecGender fromValue(String text) {
    for (TargetingSpecGender b : TargetingSpecGender.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


