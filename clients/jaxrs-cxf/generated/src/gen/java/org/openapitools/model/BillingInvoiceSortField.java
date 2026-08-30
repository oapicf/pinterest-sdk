package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Field by which to sort billing invoices.
 */
public enum BillingInvoiceSortField {
  
  DUE_DATE("DUE_DATE"),
  
  BILLING_PERIOD("BILLING_PERIOD"),
  
  DOCUMENT_TYPE("DOCUMENT_TYPE"),
  
  TOTAL_AMOUNT("TOTAL_AMOUNT"),
  
  INVOICE_NUMBER("INVOICE_NUMBER");

  private String value;

  BillingInvoiceSortField(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingInvoiceSortField fromValue(String value) {
    for (BillingInvoiceSortField b : BillingInvoiceSortField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

