package org.openapitools.model;



/**
 * Type of the credit card.
 */
public enum BillingProfileCardType {
  
  UNKNOWN("UNKNOWN"),
  
  VISA("VISA"),
  
  MASTERCARD("MASTERCARD"),
  
  AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
  
  DISCOVER("DISCOVER"),
  
  ELO("ELO");

  private String value;

  BillingProfileCardType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BillingProfileCardType fromValue(String value) {
    for (BillingProfileCardType b : BillingProfileCardType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

