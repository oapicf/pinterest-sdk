package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Advertisers billing type
 */
public enum BillingType {
  
  CREDIT_CARD("CREDIT_CARD"),
  
  INVOICE("INVOICE"),
  
  INTERNAL("INTERNAL"),
  
  RECURRING("RECURRING"),
  
  PREPAID("PREPAID");

  private String value;

  BillingType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingType fromValue(String value) {
    for (BillingType b : BillingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

