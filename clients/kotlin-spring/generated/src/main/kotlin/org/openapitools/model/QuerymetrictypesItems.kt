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
* Values: ENGAGEMENT,ENGAGEMENT_RATE,IMPRESSION,OUTBOUND_CLICK,OUTBOUND_CLICK_RATE,PIN_CLICK,PIN_CLICK_RATE,SAVE,SAVE_RATE
*/
enum class QuerymetrictypesItems(@get:JsonValue val value: kotlin.String) {

    ENGAGEMENT("ENGAGEMENT"),
    ENGAGEMENT_RATE("ENGAGEMENT_RATE"),
    IMPRESSION("IMPRESSION"),
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    OUTBOUND_CLICK_RATE("OUTBOUND_CLICK_RATE"),
    PIN_CLICK("PIN_CLICK"),
    PIN_CLICK_RATE("PIN_CLICK_RATE"),
    SAVE("SAVE"),
    SAVE_RATE("SAVE_RATE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): QuerymetrictypesItems {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'QuerymetrictypesItems'")
        }
    }
}

