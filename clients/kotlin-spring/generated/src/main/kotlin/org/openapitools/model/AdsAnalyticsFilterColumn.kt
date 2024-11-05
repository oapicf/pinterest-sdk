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
* Reporting columns for sync reporting data filter
* Values: SPEND_IN_DOLLAR,TOTAL_IMPRESSION
*/
enum class AdsAnalyticsFilterColumn(@get:JsonValue val value: kotlin.String) {

    SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
    TOTAL_IMPRESSION("TOTAL_IMPRESSION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AdsAnalyticsFilterColumn {
                return values().first{it -> it.value == value}
        }
    }
}

