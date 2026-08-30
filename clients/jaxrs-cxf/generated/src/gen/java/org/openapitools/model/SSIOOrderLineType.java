package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of an SSIO order line.
 */
public enum SSIOOrderLineType {
  
  BUDGET("BUDGET"),
  
  PERPETUALS("PERPETUALS");

  private String value;

  SSIOOrderLineType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SSIOOrderLineType fromValue(String value) {
    for (SSIOOrderLineType b : SSIOOrderLineType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

