package org.openapitools.model;



/**
 * Filter audiences by ownership type.
 */
public enum AudienceOwnershipType {
  
  OWNED("OWNED"),
  
  RECEIVED("RECEIVED");

  private String value;

  AudienceOwnershipType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceOwnershipType fromValue(String value) {
    for (AudienceOwnershipType b : AudienceOwnershipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

