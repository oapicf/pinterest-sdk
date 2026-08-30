package org.openapitools.model;



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

