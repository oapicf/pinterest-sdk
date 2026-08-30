package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ad review status
 */
public enum AdReviewStatus {
  
  OTHER("OTHER"),
  
  PENDING("PENDING"),
  
  REJECTED("REJECTED"),
  
  APPROVED("APPROVED");

  private String value;

  AdReviewStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdReviewStatus fromValue(String value) {
    for (AdReviewStatus b : AdReviewStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

