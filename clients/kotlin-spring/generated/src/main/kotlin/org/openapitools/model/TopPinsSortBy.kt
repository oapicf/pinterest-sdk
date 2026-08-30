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
* Sort metric for top pins analytics.
* Values: ENGAGEMENT,SAVE,IMPRESSION,OUTBOUND_CLICK,PIN_CLICK
*/
enum class TopPinsSortBy(@get:JsonValue val value: kotlin.String) {

    ENGAGEMENT("ENGAGEMENT"),
    SAVE("SAVE"),
    IMPRESSION("IMPRESSION"),
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    PIN_CLICK("PIN_CLICK");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): TopPinsSortBy {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TopPinsSortBy'")
        }
    }
}

