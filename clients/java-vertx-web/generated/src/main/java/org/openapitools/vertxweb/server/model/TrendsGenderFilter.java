package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Gender category for trends demographic distribution.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrendsGenderFilter fromValue(String value) {
    for (TrendsGenderFilter b : TrendsGenderFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}