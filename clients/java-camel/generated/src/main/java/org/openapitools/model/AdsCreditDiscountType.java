package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdsCreditDiscountType
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  private final String value;

  AdsCreditDiscountType(String value) {
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

