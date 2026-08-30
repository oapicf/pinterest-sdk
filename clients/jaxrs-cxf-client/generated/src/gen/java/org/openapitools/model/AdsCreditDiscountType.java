package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static AdsCreditDiscountType fromValue(String value) {
    for (AdsCreditDiscountType b : AdsCreditDiscountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

