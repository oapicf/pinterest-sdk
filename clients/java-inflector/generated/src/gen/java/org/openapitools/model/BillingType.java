package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Advertisers billing type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingType fromValue(String text) {
    for (BillingType b : BillingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


