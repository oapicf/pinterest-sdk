package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static BillingType fromValue(String value) {
    for (BillingType b : BillingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

