package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingSpecListOperation
 */
public enum TargetingSpecListOperation {
  
  SET("SET"),
  
  ADD("ADD"),
  
  REMOVE("REMOVE");

  private String value;

  TargetingSpecListOperation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingSpecListOperation fromValue(String value) {
    for (TargetingSpecListOperation b : TargetingSpecListOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

