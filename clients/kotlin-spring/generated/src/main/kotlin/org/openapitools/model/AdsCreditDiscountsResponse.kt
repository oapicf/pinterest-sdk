package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param active True if the offer code is currently active.
 * @param advertiserId Advertiser ID the offer was applied to.
 * @param discountType The type of discount of this credit
 * @param discountInMicroCurrency The discount applied in the offer’s currency value.
 * @param discountCurrency Currency value for the discount.
 * @param title Human readable title of the offer code.
 * @param remainingDiscountInMicroCurrency The credits left to spend.
 */
data class AdsCreditDiscountsResponse(

    @Schema(example = "true", description = "True if the offer code is currently active.")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12312451231", description = "Advertiser ID the offer was applied to.")
    @get:JsonProperty("advertiser_id") val advertiserId: kotlin.String? = null,

    @Schema(example = "null", description = "The type of discount of this credit")
    @get:JsonProperty("discountType") val discountType: AdsCreditDiscountsResponse.DiscountType? = null,

    @Schema(example = "125000000", description = "The discount applied in the offer’s currency value.")
    @get:JsonProperty("discountInMicroCurrency") val discountInMicroCurrency: java.math.BigDecimal? = null,

    @Schema(example = "USD", description = "Currency value for the discount.")
    @get:JsonProperty("discountCurrency") val discountCurrency: kotlin.String? = null,

    @Schema(example = "Ads Credits", description = "Human readable title of the offer code.")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "125000000", description = "The credits left to spend.")
    @get:JsonProperty("remainingDiscountInMicroCurrency") val remainingDiscountInMicroCurrency: java.math.BigDecimal? = null
) {

    /**
    * The type of discount of this credit
    * Values: COUPON,CREDIT,COUPON_APPLIED,CREDIT_APPLIED,MARKETING_OFFER_CREDIT,MARKETING_OFFER_CREDIT_APPLIED,GOODWILL_CREDIT,GOODWILL_CREDIT_APPLIED,INTERNAL_CREDIT,INTERNAL_CREDIT_APPLIED,PREPAID_CREDIT,PREPAID_CREDIT_APPLIED,SALES_INCENTIVE_CREDIT,SALES_INCENTIVE_CREDIT_APPLIED,CREDIT_EXPIRED,FUTURE_CREDIT,REFERRAL_CREDIT,INVOICE_SALES_INCENTIVE_CREDIT,INVOICE_SALES_INCENTIVE_CREDIT_APPLIED,PREPAID_CREDIT_REFUND,`null`
    */
    enum class DiscountType(val value: kotlin.String) {

        @JsonProperty("COUPON") COUPON("COUPON"),
        @JsonProperty("CREDIT") CREDIT("CREDIT"),
        @JsonProperty("COUPON_APPLIED") COUPON_APPLIED("COUPON_APPLIED"),
        @JsonProperty("CREDIT_APPLIED") CREDIT_APPLIED("CREDIT_APPLIED"),
        @JsonProperty("MARKETING_OFFER_CREDIT") MARKETING_OFFER_CREDIT("MARKETING_OFFER_CREDIT"),
        @JsonProperty("MARKETING_OFFER_CREDIT_APPLIED") MARKETING_OFFER_CREDIT_APPLIED("MARKETING_OFFER_CREDIT_APPLIED"),
        @JsonProperty("GOODWILL_CREDIT") GOODWILL_CREDIT("GOODWILL_CREDIT"),
        @JsonProperty("GOODWILL_CREDIT_APPLIED") GOODWILL_CREDIT_APPLIED("GOODWILL_CREDIT_APPLIED"),
        @JsonProperty("INTERNAL_CREDIT") INTERNAL_CREDIT("INTERNAL_CREDIT"),
        @JsonProperty("INTERNAL_CREDIT_APPLIED") INTERNAL_CREDIT_APPLIED("INTERNAL_CREDIT_APPLIED"),
        @JsonProperty("PREPAID_CREDIT") PREPAID_CREDIT("PREPAID_CREDIT"),
        @JsonProperty("PREPAID_CREDIT_APPLIED") PREPAID_CREDIT_APPLIED("PREPAID_CREDIT_APPLIED"),
        @JsonProperty("SALES_INCENTIVE_CREDIT") SALES_INCENTIVE_CREDIT("SALES_INCENTIVE_CREDIT"),
        @JsonProperty("SALES_INCENTIVE_CREDIT_APPLIED") SALES_INCENTIVE_CREDIT_APPLIED("SALES_INCENTIVE_CREDIT_APPLIED"),
        @JsonProperty("CREDIT_EXPIRED") CREDIT_EXPIRED("CREDIT_EXPIRED"),
        @JsonProperty("FUTURE_CREDIT") FUTURE_CREDIT("FUTURE_CREDIT"),
        @JsonProperty("REFERRAL_CREDIT") REFERRAL_CREDIT("REFERRAL_CREDIT"),
        @JsonProperty("INVOICE_SALES_INCENTIVE_CREDIT") INVOICE_SALES_INCENTIVE_CREDIT("INVOICE_SALES_INCENTIVE_CREDIT"),
        @JsonProperty("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED") INVOICE_SALES_INCENTIVE_CREDIT_APPLIED("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED"),
        @JsonProperty("PREPAID_CREDIT_REFUND") PREPAID_CREDIT_REFUND("PREPAID_CREDIT_REFUND"),
        @JsonProperty("null") `null`("null")
    }

}

