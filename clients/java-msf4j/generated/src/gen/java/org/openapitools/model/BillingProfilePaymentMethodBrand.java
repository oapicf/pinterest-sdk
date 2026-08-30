package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingProfilePaymentMethodBrand fromValue(String text) {
    for (BillingProfilePaymentMethodBrand b : BillingProfilePaymentMethodBrand.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

