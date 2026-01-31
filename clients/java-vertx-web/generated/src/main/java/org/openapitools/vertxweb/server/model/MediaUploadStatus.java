package org.openapitools.vertxweb.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MediaUploadStatus
 */
public enum MediaUploadStatus {
  
  REGISTERED("registered"),
  
  PROCESSING("processing"),
  
  SUCCEEDED("succeeded"),
  
  FAILED("failed");

  private String value;

  MediaUploadStatus(String value) {
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

  public static MediaUploadStatus fromValue(String value) {
    for (MediaUploadStatus b : MediaUploadStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}