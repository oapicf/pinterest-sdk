package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * The status of the item processing record
 */
public enum ItemProcessingStatus {
  
  SUCCESS("SUCCESS"),
  
  FAILURE("FAILURE"),
  
  PROCESSING("PROCESSING");

  private String value;

  ItemProcessingStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ItemProcessingStatus fromValue(String value) {
    for (ItemProcessingStatus b : ItemProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

