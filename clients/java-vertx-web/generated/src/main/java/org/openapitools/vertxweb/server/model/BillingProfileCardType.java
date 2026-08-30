package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Type of the credit card.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
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