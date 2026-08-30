package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Billing profile status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BillingProfileStatus fromValue(String value) {
    for (BillingProfileStatus b : BillingProfileStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}