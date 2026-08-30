package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.BillingProfileCardType
import org.openapitools.model.BillingProfilePaymentMethodBrand
import org.openapitools.model.BillingProfileStatus
import org.openapitools.model.BillingType
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
 * @param advertiserId Advertiser ID of the billing.
 * @param billingType Billing type of the advertiser
 * @param cardType Type of the card.
 * @param id Billing ID.
 * @param paymentMethodBrand Brand of the payment method.
 * @param status Status of the billing.
 */
data class BillingProfilesResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12312451231", description = "Advertiser ID of the billing.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("advertiser_id")
    @get:JsonProperty("advertiser_id") val advertiserId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "CREDIT_CARD", description = "Billing type of the advertiser")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("billing_type")
    @get:JsonProperty("billing_type") val billingType: BillingType? = null,

    @field:Valid
    @Schema(example = "VISA", description = "Type of the card.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("card_type")
    @get:JsonProperty("card_type") val cardType: BillingProfileCardType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12312451231", description = "Billing ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "VISA", description = "Brand of the payment method.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("payment_method_brand")
    @get:JsonProperty("payment_method_brand") val paymentMethodBrand: BillingProfilePaymentMethodBrand? = null,

    @field:Valid
    @Schema(example = "INVALID", description = "Status of the billing.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: BillingProfileStatus? = null
) {

}

