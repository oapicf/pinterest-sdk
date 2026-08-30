package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* 
* Values: COUPON,CREDIT,COUPON_APPLIED,CREDIT_APPLIED,MARKETING_OFFER_CREDIT,MARKETING_OFFER_CREDIT_APPLIED,GOODWILL_CREDIT,GOODWILL_CREDIT_APPLIED,INTERNAL_CREDIT,INTERNAL_CREDIT_APPLIED,PREPAID_CREDIT,PREPAID_CREDIT_APPLIED,SALES_INCENTIVE_CREDIT,SALES_INCENTIVE_CREDIT_APPLIED,CREDIT_EXPIRED,FUTURE_CREDIT,REFERRAL_CREDIT,INVOICE_SALES_INCENTIVE_CREDIT,INVOICE_SALES_INCENTIVE_CREDIT_APPLIED,PREPAID_CREDIT_REFUND
*/
enum class AdsCreditDiscountType(@get:JsonValue val value: kotlin.String) {

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

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AdsCreditDiscountType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdsCreditDiscountType'")
        }
    }
}

