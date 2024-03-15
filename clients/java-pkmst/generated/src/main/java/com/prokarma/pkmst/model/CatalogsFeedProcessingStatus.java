package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static CatalogsFeedProcessingStatus fromValue(String text) {
    for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

