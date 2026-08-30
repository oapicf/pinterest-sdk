package org.openapitools.model;



/**
 * Gets or Sets BasePreferredMediaType
 */
public enum BasePreferredMediaType {
  
  VIDEO("VIDEO"),
  
  IMAGE("IMAGE");

  private String value;

  BasePreferredMediaType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BasePreferredMediaType fromValue(String value) {
    for (BasePreferredMediaType b : BasePreferredMediaType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

