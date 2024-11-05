package org.openapitools.model;



/**
 * Gets or Sets AudienceShareType
 */
public enum AudienceShareType {
  
  SHARED("SHARED"),
  
  RECEIVED("RECEIVED");

  private String value;

  AudienceShareType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceShareType fromValue(String value) {
    for (AudienceShareType b : AudienceShareType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

