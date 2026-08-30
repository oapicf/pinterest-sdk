package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AdsCreditDiscountType
 */
public enum AdsCreditDiscountType {
  
  COUPON("COUPON"),
  
  CREDIT("CREDIT"),
  
  COUPON_APPLIED("COUPON_APPLIED"),
  
  CREDIT_APPLIED("CREDIT_APPLIED"),
  
  MARKETING_OFFER_CREDIT("MARKETING_OFFER_CREDIT"),
  
  MARKETING_OFFER_CREDIT_APPLIED("MARKETING_OFFER_CREDIT_APPLIED"),
  
  GOODWILL_CREDIT("GOODWILL_CREDIT"),
  
  GOODWILL_CREDIT_APPLIED("GOODWILL_CREDIT_APPLIED"),
  
  INTERNAL_CREDIT("INTERNAL_CREDIT"),
  
  INTERNAL_CREDIT_APPLIED("INTERNAL_CREDIT_APPLIED"),
  
  PREPAID_CREDIT("PREPAID_CREDIT"),
  
  PREPAID_CREDIT_APPLIED("PREPAID_CREDIT_APPLIED"),
  
  SALES_INCENTIVE_CREDIT("SALES_INCENTIVE_CREDIT"),
  
  SALES_INCENTIVE_CREDIT_APPLIED("SALES_INCENTIVE_CREDIT_APPLIED"),
  
  CREDIT_EXPIRED("CREDIT_EXPIRED"),
  
  FUTURE_CREDIT("FUTURE_CREDIT"),
  
  REFERRAL_CREDIT("REFERRAL_CREDIT"),
  
  INVOICE_SALES_INCENTIVE_CREDIT("INVOICE_SALES_INCENTIVE_CREDIT"),
  
  INVOICE_SALES_INCENTIVE_CREDIT_APPLIED("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED"),
  
  PREPAID_CREDIT_REFUND("PREPAID_CREDIT_REFUND");

  private String value;

  AdsCreditDiscountType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdsCreditDiscountType fromValue(String text) {
    for (AdsCreditDiscountType b : AdsCreditDiscountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


