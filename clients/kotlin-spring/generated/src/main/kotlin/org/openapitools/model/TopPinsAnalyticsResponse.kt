package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability
import org.openapitools.model.TopPinsAnalyticsResponsePinsInner
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
 * @param dateAvailability 
 * @param pins 
 * @param sortBy 
 */
data class TopPinsAnalyticsResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("date_availability") val dateAvailability: TopPinsAnalyticsResponseDateAvailability? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pins") val pins: kotlin.collections.List<TopPinsAnalyticsResponsePinsInner>? = null,

    @Schema(example = "IMPRESSION", description = "")
    @get:JsonProperty("sort_by") val sortBy: TopPinsAnalyticsResponse.SortBy? = null
    ) {

    /**
    * 
    * Values: ENGAGEMENT,SAVE,IMPRESSION,OUTBOUND_CLICK,PIN_CLICK
    */
    enum class SortBy(@get:JsonValue val value: kotlin.String) {

        ENGAGEMENT("ENGAGEMENT"),
        SAVE("SAVE"),
        IMPRESSION("IMPRESSION"),
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        PIN_CLICK("PIN_CLICK");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SortBy {
                return values().first{it -> it.value == value}
            }
        }
    }

}

