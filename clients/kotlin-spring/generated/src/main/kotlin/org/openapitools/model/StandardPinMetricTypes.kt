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
* Standard Pin metric types
* Values: IMPRESSION,OUTBOUND_CLICK,PIN_CLICK,SAVE,SAVE_RATE,TOTAL_COMMENTS,TOTAL_REACTIONS,USER_FOLLOW,PROFILE_VISIT
*/
enum class StandardPinMetricTypes(@get:JsonValue val value: kotlin.String) {

    IMPRESSION("IMPRESSION"),
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    PIN_CLICK("PIN_CLICK"),
    SAVE("SAVE"),
    SAVE_RATE("SAVE_RATE"),
    TOTAL_COMMENTS("TOTAL_COMMENTS"),
    TOTAL_REACTIONS("TOTAL_REACTIONS"),
    USER_FOLLOW("USER_FOLLOW"),
    PROFILE_VISIT("PROFILE_VISIT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): StandardPinMetricTypes {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'StandardPinMetricTypes'")
        }
    }
}

