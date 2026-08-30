package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static IngestionSource fromValue(String text) {
    for (IngestionSource b : IngestionSource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


