package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The status of a billing invoice.
 */
public enum BillingInvoiceStatus {
  
  OPEN("OPEN"),
  
  CLOSED("CLOSED");

  private final String value;

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

