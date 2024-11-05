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
* Filter operator for sync reporting
* Values: LESS_THAN,GREATER_THAN
*/
enum class AdsAnalyticsFilterOperator(@get:JsonValue val value: kotlin.String) {

    LESS_THAN("LESS_THAN"),
    GREATER_THAN("GREATER_THAN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AdsAnalyticsFilterOperator {
                return values().first{it -> it.value == value}
        }
    }
}

