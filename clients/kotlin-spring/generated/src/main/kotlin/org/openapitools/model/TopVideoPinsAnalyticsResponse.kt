package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability
import org.openapitools.model.TopVideoPinsAnalyticsResponsePinsInner
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
data class TopVideoPinsAnalyticsResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("date_availability") val dateAvailability: TopPinsAnalyticsResponseDateAvailability? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pins") val pins: kotlin.collections.List<TopVideoPinsAnalyticsResponsePinsInner>? = null,

    @Schema(example = "IMPRESSION", description = "")
    @get:JsonProperty("sort_by") val sortBy: TopVideoPinsAnalyticsResponse.SortBy? = null
    ) {

    /**
    * 
    * Values: SAVE,IMPRESSION,OUTBOUND_CLICK,VIDEO_MRC_VIEW,VIDEO_AVG_WATCH_TIME,VIDEO_V50_WATCH_TIME,QUARTILE_95_PERCENT_VIEW,VIDEO_10S_VIEW,VIDEO_START
    */
    enum class SortBy(@get:JsonValue val value: kotlin.String) {

        SAVE("SAVE"),
        IMPRESSION("IMPRESSION"),
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
        VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
        VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
        QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
        VIDEO_10S_VIEW("VIDEO_10S_VIEW"),
        VIDEO_START("VIDEO_START");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SortBy {
                return values().first{it -> it.value == value}
            }
        }
    }

}

