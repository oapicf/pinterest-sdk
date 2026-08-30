package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdsCreditDiscountType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AdsCreditDiscountType fromString(String s) {
      for (AdsCreditDiscountType b : AdsCreditDiscountType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      return null;
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdsCreditDiscountType fromValue(String value) {
    for (AdsCreditDiscountType b : AdsCreditDiscountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


