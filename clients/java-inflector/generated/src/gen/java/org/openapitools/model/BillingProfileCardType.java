package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Type of the credit card.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingProfileCardType fromValue(String text) {
    for (BillingProfileCardType b : BillingProfileCardType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


