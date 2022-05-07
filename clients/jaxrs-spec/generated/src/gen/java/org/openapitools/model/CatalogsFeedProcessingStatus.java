package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CatalogsFeedProcessingStatus
 */
public enum CatalogsFeedProcessingStatus {
  
  COMPLETED("COMPLETED"),
  
  COMPLETED_EARLY("COMPLETED_EARLY"),
  
  DISAPPROVED("DISAPPROVED"),
  
  FAILED("FAILED"),
  
  PROCESSING("PROCESSING"),
  
  QUEUED_FOR_PROCESSING("QUEUED_FOR_PROCESSING"),
  
  UNDER_APPEAL("UNDER_APPEAL"),
  
  UNDER_REVIEW("UNDER_REVIEW");

  private String value;

  CatalogsFeedProcessingStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsFeedProcessingStatus fromValue(String value) {
    for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


