package org.openapitools.model;



/**
 * Entity status
 */
public enum NonDraftEntityStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  ARCHIVED("ARCHIVED");

  private String value;

  NonDraftEntityStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NonDraftEntityStatus fromValue(String value) {
    for (NonDraftEntityStatus b : NonDraftEntityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

