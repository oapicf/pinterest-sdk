package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Brand of the payment method.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Brand of the payment method.
 */
public enum BillingProfilePaymentMethodBrand {
  
  UNKNOWN("UNKNOWN"),
  
  VISA("VISA"),
  
  MASTERCARD("MASTERCARD"),
  
  AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
  
  DISCOVER("DISCOVER"),
  
  SOFORT("SOFORT"),
  
  DINERS_CLUB("DINERS_CLUB"),
  
  ELO("ELO"),
  
  CARTE_BANCAIRE("CARTE_BANCAIRE");

  private String value;

  BillingProfilePaymentMethodBrand(String value) {
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

  public static BillingProfilePaymentMethodBrand fromValue(String value) {
    for (BillingProfilePaymentMethodBrand b : BillingProfilePaymentMethodBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}