package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * List of ingestion sources for a conversion event.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of ingestion sources for a conversion event.
 */
public enum IngestionSourceOptions {
  
  TAG("TAG"),
  
  MMP("MMP"),
  
  FILE_UPLOAD("FILE_UPLOAD"),
  
  CONVERSIONS_API("CONVERSIONS_API"),
  
  NATIVE("NATIVE");

  private String value;

  IngestionSourceOptions(String value) {
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

  public static IngestionSourceOptions fromValue(String value) {
    for (IngestionSourceOptions b : IngestionSourceOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}