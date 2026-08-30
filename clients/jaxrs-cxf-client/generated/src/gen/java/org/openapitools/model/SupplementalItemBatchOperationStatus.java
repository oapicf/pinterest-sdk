package org.openapitools.model;



/**
 * The status of the batch operation
 */
public enum SupplementalItemBatchOperationStatus {
  
  PROCESSING("PROCESSING"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED");

  private String value;

  SupplementalItemBatchOperationStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SupplementalItemBatchOperationStatus fromValue(String value) {
    for (SupplementalItemBatchOperationStatus b : SupplementalItemBatchOperationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

