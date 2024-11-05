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
* Ad group billable event type. For update, only draft ad groups may update billable event.
* Values: CLICKTHROUGH,IMPRESSION,VIDEO_V_50_MRC
*/
enum class ActionType(@get:JsonValue val value: kotlin.String) {

    CLICKTHROUGH("CLICKTHROUGH"),
    IMPRESSION("IMPRESSION"),
    VIDEO_V_50_MRC("VIDEO_V_50_MRC");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ActionType {
                return values().first{it -> it.value == value}
        }
    }
}

