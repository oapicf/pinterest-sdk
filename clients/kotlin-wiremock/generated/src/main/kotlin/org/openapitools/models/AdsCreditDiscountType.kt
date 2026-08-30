@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdsCreditDiscountType {
    @JsonProperty(value = "COUPON") COUPON,
    @JsonProperty(value = "CREDIT") CREDIT,
    @JsonProperty(value = "COUPON_APPLIED") COUPON_APPLIED,
    @JsonProperty(value = "CREDIT_APPLIED") CREDIT_APPLIED,
    @JsonProperty(value = "MARKETING_OFFER_CREDIT") MARKETING_OFFER_CREDIT,
    @JsonProperty(value = "MARKETING_OFFER_CREDIT_APPLIED") MARKETING_OFFER_CREDIT_APPLIED,
    @JsonProperty(value = "GOODWILL_CREDIT") GOODWILL_CREDIT,
    @JsonProperty(value = "GOODWILL_CREDIT_APPLIED") GOODWILL_CREDIT_APPLIED,
    @JsonProperty(value = "INTERNAL_CREDIT") INTERNAL_CREDIT,
    @JsonProperty(value = "INTERNAL_CREDIT_APPLIED") INTERNAL_CREDIT_APPLIED,
    @JsonProperty(value = "PREPAID_CREDIT") PREPAID_CREDIT,
    @JsonProperty(value = "PREPAID_CREDIT_APPLIED") PREPAID_CREDIT_APPLIED,
    @JsonProperty(value = "SALES_INCENTIVE_CREDIT") SALES_INCENTIVE_CREDIT,
    @JsonProperty(value = "SALES_INCENTIVE_CREDIT_APPLIED") SALES_INCENTIVE_CREDIT_APPLIED,
    @JsonProperty(value = "CREDIT_EXPIRED") CREDIT_EXPIRED,
    @JsonProperty(value = "FUTURE_CREDIT") FUTURE_CREDIT,
    @JsonProperty(value = "REFERRAL_CREDIT") REFERRAL_CREDIT,
    @JsonProperty(value = "INVOICE_SALES_INCENTIVE_CREDIT") INVOICE_SALES_INCENTIVE_CREDIT,
    @JsonProperty(value = "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED") INVOICE_SALES_INCENTIVE_CREDIT_APPLIED,
    @JsonProperty(value = "PREPAID_CREDIT_REFUND") PREPAID_CREDIT_REFUND,
}
