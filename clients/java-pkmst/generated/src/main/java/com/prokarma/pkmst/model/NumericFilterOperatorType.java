package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets NumericFilterOperatorType
 */
public enum NumericFilterOperatorType {
  
  GREATER_THAN("GREATER_THAN"),
  
  GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
  
  LESS_THAN("LESS_THAN"),
  
  LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");

  private String value;

  NumericFilterOperatorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NumericFilterOperatorType fromValue(String text) {
    for (NumericFilterOperatorType b : NumericFilterOperatorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

