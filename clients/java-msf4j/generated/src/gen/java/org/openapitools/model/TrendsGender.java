package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static TrendsGender fromValue(String text) {
    for (TrendsGender b : TrendsGender.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

