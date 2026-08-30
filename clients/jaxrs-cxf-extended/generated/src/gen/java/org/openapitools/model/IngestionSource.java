package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets IngestionSource
 */
public enum IngestionSource {
  
  TAG("TAG"),
  
  MMP("MMP"),
  
  FILE_UPLOAD("FILE_UPLOAD"),
  
  CONVERSIONS_API("CONVERSIONS_API"),
  
  NATIVE("NATIVE");

  private String value;

  IngestionSource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IngestionSource fromValue(String value) {
    for (IngestionSource b : IngestionSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

