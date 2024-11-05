package org.openapitools.model;



/**
 * Gets or Sets MediaType
 */
public enum MediaType {
  
  IMAGE("IMAGE"),
  
  VIDEO("VIDEO");

  private String value;

  MediaType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaType fromValue(String value) {
    for (MediaType b : MediaType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

