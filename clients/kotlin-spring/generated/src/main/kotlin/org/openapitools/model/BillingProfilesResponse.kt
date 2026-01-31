package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
    @get:JsonProperty("advertiser_id") val advertiserId: kotlin.String? = null,

    @Schema(example = "CREDIT_CARD", description = "Billing type of the advertiser")
    @get:JsonProperty("billing_type") val billingType: BillingProfilesResponse.BillingType? = null,

    @Schema(example = "VISA", description = "Type of the card.")
    @get:JsonProperty("card_type") val cardType: BillingProfilesResponse.CardType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12312451231", description = "Billing ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "VISA", description = "Brand of the payment method.")
    @get:JsonProperty("payment_method_brand") val paymentMethodBrand: BillingProfilesResponse.PaymentMethodBrand? = null,

    @Schema(example = "INVALID", description = "Status of the billing.")
    @get:JsonProperty("status") val status: BillingProfilesResponse.Status? = null
) {

    /**
    * Billing type of the advertiser
    * Values: CREDIT_CARD,INVOICE,INTERNAL,RECURRING,PREPAID
    */
    enum class BillingType(@get:JsonValue val value: kotlin.String) {

        CREDIT_CARD("CREDIT_CARD"),
        INVOICE("INVOICE"),
        INTERNAL("INTERNAL"),
        RECURRING("RECURRING"),
        PREPAID("PREPAID");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): BillingType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BillingProfilesResponse'")
            }
        }
    }

    /**
    * Type of the card.
    * Values: UNKNOWN,VISA,MASTERCARD,AMERICAN_EXPRESS,DISCOVER,ELO
    */
    enum class CardType(@get:JsonValue val value: kotlin.String) {

        UNKNOWN("UNKNOWN"),
        VISA("VISA"),
        MASTERCARD("MASTERCARD"),
        AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
        DISCOVER("DISCOVER"),
        ELO("ELO");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CardType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BillingProfilesResponse'")
            }
        }
    }

    /**
    * Brand of the payment method.
    * Values: UNKNOWN,VISA,MASTERCARD,AMERICAN_EXPRESS,DISCOVER,SOFORT,DINERS_CLUB,ELO,CARTE_BANCAIRE
    */
    enum class PaymentMethodBrand(@get:JsonValue val value: kotlin.String) {

        UNKNOWN("UNKNOWN"),
        VISA("VISA"),
        MASTERCARD("MASTERCARD"),
        AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
        DISCOVER("DISCOVER"),
        SOFORT("SOFORT"),
        DINERS_CLUB("DINERS_CLUB"),
        ELO("ELO"),
        CARTE_BANCAIRE("CARTE_BANCAIRE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PaymentMethodBrand {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BillingProfilesResponse'")
            }
        }
    }

    /**
    * Status of the billing.
    * Values: UNSPECIFIED,VALID,INVALID,PENDING,DELETED,SECONDARY,PENDING_SECONDARY
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        UNSPECIFIED("UNSPECIFIED"),
        VALID("VALID"),
        INVALID("INVALID"),
        PENDING("PENDING"),
        DELETED("DELETED"),
        SECONDARY("SECONDARY"),
        PENDING_SECONDARY("PENDING_SECONDARY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BillingProfilesResponse'")
            }
        }
    }

}

