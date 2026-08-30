package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gender category for trends demographic distribution.
 */
public enum TrendsGender {
  
  MALE("male"),
  
  FEMALE("female"),
  
  UNSPECIFIED("unspecified");

  private String value;

  TrendsGender(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrendsGender fromValue(String value) {
    for (TrendsGender b : TrendsGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

