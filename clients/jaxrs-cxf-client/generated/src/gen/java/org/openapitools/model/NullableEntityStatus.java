package org.openapitools.model;



/**
 * Entity status
 */
public enum NullableEntityStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  ARCHIVED("ARCHIVED"),
  
  DRAFT("DRAFT"),
  
  DELETED_DRAFT("DELETED_DRAFT");

  private String value;

  NullableEntityStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NullableEntityStatus fromValue(String value) {
    for (NullableEntityStatus b : NullableEntityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

