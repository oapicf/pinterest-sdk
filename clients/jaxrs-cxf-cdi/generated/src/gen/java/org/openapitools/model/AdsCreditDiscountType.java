package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdsCreditDiscountType {

    @JsonProperty("COUPON") COUPON(String.valueOf("COUPON")), @JsonProperty("CREDIT") CREDIT(String.valueOf("CREDIT")), @JsonProperty("COUPON_APPLIED") COUPON_APPLIED(String.valueOf("COUPON_APPLIED")), @JsonProperty("CREDIT_APPLIED") CREDIT_APPLIED(String.valueOf("CREDIT_APPLIED")), @JsonProperty("MARKETING_OFFER_CREDIT") MARKETING_OFFER_CREDIT(String.valueOf("MARKETING_OFFER_CREDIT")), @JsonProperty("MARKETING_OFFER_CREDIT_APPLIED") MARKETING_OFFER_CREDIT_APPLIED(String.valueOf("MARKETING_OFFER_CREDIT_APPLIED")), @JsonProperty("GOODWILL_CREDIT") GOODWILL_CREDIT(String.valueOf("GOODWILL_CREDIT")), @JsonProperty("GOODWILL_CREDIT_APPLIED") GOODWILL_CREDIT_APPLIED(String.valueOf("GOODWILL_CREDIT_APPLIED")), @JsonProperty("INTERNAL_CREDIT") INTERNAL_CREDIT(String.valueOf("INTERNAL_CREDIT")), @JsonProperty("INTERNAL_CREDIT_APPLIED") INTERNAL_CREDIT_APPLIED(String.valueOf("INTERNAL_CREDIT_APPLIED")), @JsonProperty("PREPAID_CREDIT") PREPAID_CREDIT(String.valueOf("PREPAID_CREDIT")), @JsonProperty("PREPAID_CREDIT_APPLIED") PREPAID_CREDIT_APPLIED(String.valueOf("PREPAID_CREDIT_APPLIED")), @JsonProperty("SALES_INCENTIVE_CREDIT") SALES_INCENTIVE_CREDIT(String.valueOf("SALES_INCENTIVE_CREDIT")), @JsonProperty("SALES_INCENTIVE_CREDIT_APPLIED") SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("SALES_INCENTIVE_CREDIT_APPLIED")), @JsonProperty("CREDIT_EXPIRED") CREDIT_EXPIRED(String.valueOf("CREDIT_EXPIRED")), @JsonProperty("FUTURE_CREDIT") FUTURE_CREDIT(String.valueOf("FUTURE_CREDIT")), @JsonProperty("REFERRAL_CREDIT") REFERRAL_CREDIT(String.valueOf("REFERRAL_CREDIT")), @JsonProperty("INVOICE_SALES_INCENTIVE_CREDIT") INVOICE_SALES_INCENTIVE_CREDIT(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT")), @JsonProperty("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED") INVOICE_SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED")), @JsonProperty("PREPAID_CREDIT_REFUND") PREPAID_CREDIT_REFUND(String.valueOf("PREPAID_CREDIT_REFUND"));


    private String value;

    AdsCreditDiscountType(String v) {
        value = v;
    }

    public String value() {
        return value;
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



