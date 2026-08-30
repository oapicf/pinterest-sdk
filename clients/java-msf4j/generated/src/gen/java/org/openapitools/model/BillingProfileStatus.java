package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Billing profile status
 */
public enum BillingProfileStatus {
  
  UNSPECIFIED("UNSPECIFIED"),
  
  VALID("VALID"),
  
  INVALID("INVALID"),
  
  PENDING("PENDING"),
  
  DELETED("DELETED"),
  
  SECONDARY("SECONDARY"),
  
  PENDING_SECONDARY("PENDING_SECONDARY");

  private String value;

  BillingProfileStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingProfileStatus fromValue(String text) {
    for (BillingProfileStatus b : BillingProfileStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

