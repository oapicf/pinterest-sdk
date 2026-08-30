package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Keyword match type allowing null
 */
public enum NullalbleMatchType {
  
  BROAD("BROAD"),
  
  PHRASE("PHRASE"),
  
  EXACT("EXACT"),
  
  EXACT_NEGATIVE("EXACT_NEGATIVE"),
  
  PHRASE_NEGATIVE("PHRASE_NEGATIVE");

  private String value;

  NullalbleMatchType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NullalbleMatchType fromValue(String value) {
    for (NullalbleMatchType b : NullalbleMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

