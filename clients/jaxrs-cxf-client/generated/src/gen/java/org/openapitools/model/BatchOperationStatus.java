package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * The status of the operation performed by the batch
 */
public enum BatchOperationStatus {
  
  PROCESSING("PROCESSING"),
  
  COMPLETED("COMPLETED");

  private String value;

  BatchOperationStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BatchOperationStatus fromValue(String value) {
    for (BatchOperationStatus b : BatchOperationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

