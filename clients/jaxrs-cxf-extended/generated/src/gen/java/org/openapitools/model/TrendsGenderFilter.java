package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gender category for trends demographic distribution.
 */
public enum TrendsGenderFilter {
  
  MALE("male"),
  
  FEMALE("female"),
  
  UNKNOWN("unknown");

  private String value;

  TrendsGenderFilter(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrendsGenderFilter fromValue(String value) {
    for (TrendsGenderFilter b : TrendsGenderFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

