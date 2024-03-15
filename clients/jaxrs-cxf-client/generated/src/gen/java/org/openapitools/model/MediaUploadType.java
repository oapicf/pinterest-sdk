package org.openapitools.model;



/**
 * Gets or Sets MediaUploadType
 */
public enum MediaUploadType {
  
  VIDEO("video");

  private String value;

  MediaUploadType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaUploadType fromValue(String value) {
    for (MediaUploadType b : MediaUploadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

