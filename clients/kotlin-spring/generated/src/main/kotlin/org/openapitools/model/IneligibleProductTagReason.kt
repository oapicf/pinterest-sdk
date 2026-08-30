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
* Reason why a product pin is ineligible for tagging.
* Values: PIN_MISSING,PIN_IS_PRIVATE,PRODUCT_METADATA_MISSING,PIN_NOT_FROM_VERIFIED_DOMAIN,PIN_NOT_FROM_SAME_USER_AS_HERO_PIN
*/
enum class IneligibleProductTagReason(@get:JsonValue val value: kotlin.String) {

    PIN_MISSING("PIN_MISSING"),
    PIN_IS_PRIVATE("PIN_IS_PRIVATE"),
    PRODUCT_METADATA_MISSING("PRODUCT_METADATA_MISSING"),
    PIN_NOT_FROM_VERIFIED_DOMAIN("PIN_NOT_FROM_VERIFIED_DOMAIN"),
    PIN_NOT_FROM_SAME_USER_AS_HERO_PIN("PIN_NOT_FROM_SAME_USER_AS_HERO_PIN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): IneligibleProductTagReason {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'IneligibleProductTagReason'")
        }
    }
}

