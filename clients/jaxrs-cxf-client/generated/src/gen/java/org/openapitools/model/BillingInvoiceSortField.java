package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static BillingInvoiceSortField fromValue(String value) {
    for (BillingInvoiceSortField b : BillingInvoiceSortField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

