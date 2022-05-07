package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

