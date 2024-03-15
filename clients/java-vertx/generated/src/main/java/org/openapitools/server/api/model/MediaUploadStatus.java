package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Media upload status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Media upload status
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