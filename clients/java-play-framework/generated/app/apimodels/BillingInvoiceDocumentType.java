package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of a billing invoice document.
 */
public enum BillingInvoiceDocumentType {
  
  INVOICE("INVOICE"),
  
  CREDIT_MEMO("CREDIT_MEMO");

  private final String value;

  BillingInvoiceDocumentType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingInvoiceDocumentType fromValue(String value) {
    for (BillingInvoiceDocumentType b : BillingInvoiceDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

