package org.openapitools.model;



/**
 * The status of the item processing record
 */
public enum SupplementalItemProcessingStatus {
  
  SUCCESS("SUCCESS"),
  
  FAILURE("FAILURE"),
  
  PROCESSING("PROCESSING");

  private String value;

  SupplementalItemProcessingStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SupplementalItemProcessingStatus fromValue(String value) {
    for (SupplementalItemProcessingStatus b : SupplementalItemProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

