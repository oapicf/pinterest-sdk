package org.openapitools.model;



/**
 * Gets or Sets ContentType
 */
public enum ContentType {
  
  IMAGE_JPEG("image/jpeg"),
  
  IMAGE_PNG("image/png");

  private String value;

  ContentType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContentType fromValue(String value) {
    for (ContentType b : ContentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

