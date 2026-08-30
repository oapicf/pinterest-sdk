package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The type of a billing invoice document.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a billing invoice document.
 */
public enum BillingInvoiceDocumentType {
  
  INVOICE("INVOICE"),
  
  CREDIT_MEMO("CREDIT_MEMO");

  private String value;

  BillingInvoiceDocumentType(String value) {
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

  public static BillingInvoiceDocumentType fromValue(String value) {
    for (BillingInvoiceDocumentType b : BillingInvoiceDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}