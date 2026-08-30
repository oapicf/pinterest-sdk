package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The status of a billing invoice.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BillingInvoiceStatus fromValue(String value) {
    for (BillingInvoiceStatus b : BillingInvoiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}