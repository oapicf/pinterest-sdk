package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Media upload status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MediaUploadStatus fromValue(String text) {
    for (MediaUploadStatus b : MediaUploadStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


