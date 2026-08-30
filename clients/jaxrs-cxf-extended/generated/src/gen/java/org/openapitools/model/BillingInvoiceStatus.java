package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of a billing invoice.
 */
public enum BillingInvoiceStatus {
  
  OPEN("OPEN"),
  
  CLOSED("CLOSED");

  private String value;

  BillingInvoiceStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingInvoiceStatus fromValue(String value) {
    for (BillingInvoiceStatus b : BillingInvoiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

