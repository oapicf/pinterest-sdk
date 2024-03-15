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
 * @param id Billing ID.
 * @param cardType Type of the card.
 * @param status Status of the billing.
 * @param advertiserId Advertiser ID of the billing.
 * @param paymentMethodBrand Brand of the payment method.
 */
data class BillingProfilesResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12312451231", description = "Billing ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "VISA", description = "Type of the card.")
    @get:JsonProperty("card_type") val cardType: BillingProfilesResponse.CardType? = null,

    @Schema(example = "INVALID", description = "Status of the billing.")
    @get:JsonProperty("status") val status: BillingProfilesResponse.Status? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12312451231", description = "Advertiser ID of the billing.")
    @get:JsonProperty("advertiser_id") val advertiserId: kotlin.String? = null,

    @Schema(example = "VISA", description = "Brand of the payment method.")
    @get:JsonProperty("payment_method_brand") val paymentMethodBrand: BillingProfilesResponse.PaymentMethodBrand? = null
) {

    /**
    * Type of the card.
    * Values: UNKNOWN,VISA,MASTERCARD,AMERICAN_EXPRESS,DISCOVER,ELO
    */
    enum class CardType(val value: kotlin.String) {

        @JsonProperty("UNKNOWN") UNKNOWN("UNKNOWN"),
        @JsonProperty("VISA") VISA("VISA"),
        @JsonProperty("MASTERCARD") MASTERCARD("MASTERCARD"),
        @JsonProperty("AMERICAN_EXPRESS") AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
        @JsonProperty("DISCOVER") DISCOVER("DISCOVER"),
        @JsonProperty("ELO") ELO("ELO")
    }

    /**
    * Status of the billing.
    * Values: UNSPECIFIED,VALID,INVALID,PENDING,DELETED,SECONDARY,PENDING_SECONDARY
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("UNSPECIFIED") UNSPECIFIED("UNSPECIFIED"),
        @JsonProperty("VALID") VALID("VALID"),
        @JsonProperty("INVALID") INVALID("INVALID"),
        @JsonProperty("PENDING") PENDING("PENDING"),
        @JsonProperty("DELETED") DELETED("DELETED"),
        @JsonProperty("SECONDARY") SECONDARY("SECONDARY"),
        @JsonProperty("PENDING_SECONDARY") PENDING_SECONDARY("PENDING_SECONDARY")
    }

    /**
    * Brand of the payment method.
    * Values: UNKNOWN,VISA,MASTERCARD,AMERICAN_EXPRESS,DISCOVER,SOFORT,DINERS_CLUB,ELO,CARTE_BANCAIRE
    */
    enum class PaymentMethodBrand(val value: kotlin.String) {

        @JsonProperty("UNKNOWN") UNKNOWN("UNKNOWN"),
        @JsonProperty("VISA") VISA("VISA"),
        @JsonProperty("MASTERCARD") MASTERCARD("MASTERCARD"),
        @JsonProperty("AMERICAN_EXPRESS") AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
        @JsonProperty("DISCOVER") DISCOVER("DISCOVER"),
        @JsonProperty("SOFORT") SOFORT("SOFORT"),
        @JsonProperty("DINERS_CLUB") DINERS_CLUB("DINERS_CLUB"),
        @JsonProperty("ELO") ELO("ELO"),
        @JsonProperty("CARTE_BANCAIRE") CARTE_BANCAIRE("CARTE_BANCAIRE")
    }

}

