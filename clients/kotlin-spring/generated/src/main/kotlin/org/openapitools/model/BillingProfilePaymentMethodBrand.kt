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
* Brand of the payment method.
* Values: UNKNOWN,VISA,MASTERCARD,AMERICAN_EXPRESS,DISCOVER,SOFORT,DINERS_CLUB,ELO,CARTE_BANCAIRE
*/
enum class BillingProfilePaymentMethodBrand(@get:JsonValue val value: kotlin.String) {

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
        fun forValue(value: kotlin.String): BillingProfilePaymentMethodBrand {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BillingProfilePaymentMethodBrand'")
        }
    }
}

