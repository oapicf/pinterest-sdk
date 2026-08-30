package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static TrendsGenderFilter fromValue(String text) {
    for (TrendsGenderFilter b : TrendsGenderFilter.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

